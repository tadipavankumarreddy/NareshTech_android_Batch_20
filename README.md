# NareshTech_android_Batch_20
whatever the code that is discussed and explained will be present here along with the important links. This also serves as the notes.

[Demo Sessions 03rd Oct 2023 to 11th Oct 2023 can be found here](https://docs.google.com/document/d/1gOPSfRau1JgC-OV5V4KUWerZmK0Q8IDDM3hPw_PmzbU/edit)

Access My Free Ebook (Android application development using Java) [here](https://android-app-development-documentation.readthedocs.io/en/latest/)

## Kotlin Essentials for Android
[Refer to the official Documentation of Kotlin](https://kotlinlang.org/docs/home.html)

[Why to Learn to Kotlin for android app Development ?](https://kotlinlang.org/docs/android-overview.html)

### First Kotlin Program
```Kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

// Kotlin is both object oriented and functional.
fun main(){
   println("Hello World!")
}
```

### Working with variables in Kotlin
- There are two types of variables in kotlin
    - Immutable Variables   - Variables that does not change value are called immutable variables.When you assign a value to an immutable variable, the value cannot be altered later on in the program.Immutable variables are declared using a keyword `val`
```kotlin
fun main(){
   val x = 10
   println(x)
}
```
    - Mutable Variables     - Variables that does change value  are called mutable variables. These variables are declared using `var` keyword
```koltin
fun main(){
   var x = 10
   x = 23
   println(x)
}
```

### Important points to Note
- For the statements in kotlin, you need not write ";" (statement Terminator)
- Type Inference means that deciding the variable type based on the value assigned to it. This concept is present in kotlin.

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

// Kotlin is both object oriented and functional.
fun main(){
   var x = 10
   var y = 20
   println("The value of x is $x")
   println("$x + $y = ${x+y}")
}
```
