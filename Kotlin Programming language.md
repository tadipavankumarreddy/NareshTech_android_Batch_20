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
### Data Types in kotlin
Kotlin supports `Type Inference`. As you assign a value to a variable the data type of the variable will be decided based on the assignment.

Kotlin supports a set of built-in types that represent numbers. for Integer numbers, there are four types with different sizes and , hence, value ranges. 

- Byte
- Short
- Int
- Long

***When you initialize a variable with no explicit type specification, the compiler automatically infers the type with the smallest range enough to represent the value starting from Int. If it is not exceeding the range of Int, the type is Int. If it exceeds, the type is Long. To specify the Long value explicitly, append the suffix L to the value. Explicit type specification triggers the compiler to check the value not to exceed the range of the specified type.***

[Refer More here](https://kotlinlang.org/docs/numbers.html#floating-point-types)

### Floating-point types
- Float (single Precision)
- Double (double precision)

to represent Float value use `F` or `f` followed by the value that you assign. 

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

fun main(){
    val x = 10
    println(x::class.java.typeName)

    val y = 9L
    println(y::class.java.typeName)

    var z:Byte = 89
    println(z::class.java.typeName)

    val a:Short = 78
    println(a::class.java.typeName)

    val d = 10.8923
    println(d::class.java.typeName)

    val e = 12.34f
    println(e::class.java.typeName)
}
```

***Output***
```
int
long
byte
short
double
float

Process finished with exit code 0
```

***Explicit Type Conversion***

- toByte()
- toShort()
- toInt()
- toLong()
- toFloat()
- toDouble()

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

fun main(){
    val a:Byte = 1
    val b = a.toInt()
    println(b::class.java.typeName)

    val a1:Int = 1234
    val b1 = a1.toByte()
    println("$b ${b1} type is ${b1::class.java.typeName} ")
}
```

***Output***
```
int
1 -46 type is byte 

Process finished with exit code 0
```

***We can even declare the variables in the global section so that the variables can be accessed by other functions in the program***

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

val pi  = 3.14
var a = 0
fun main(){
    println("The value of Pi is $pi")
    increment()
    println("The value of a is $a")
}

fun increment(){
    a++
}
```

***output***
```
The value of Pi is 3.14
The value of a is 1

Process finished with exit code 0
```

### Functions in Kotlin

All functions in kotlin must be defined with a keyword `fun` . The return types are mentioned after the function declaration.

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

/**
 * The following function takes in two integers and returns an Integer*/
fun sum1(a:Int,b:Int):Int{
    return a+b
}

/**
 *The following function takes in two integers and returns nothing. You need not to specify Unit */

fun sum2(a:Int, b:Int):Unit{
    println("$a + $b = ${a+b}")
}

/**
 * Functions in kotlin can go in a single line*/

fun sum3(a:Int, b:Int):Int = a+b

fun main(){
    println("The sum of 10 and 20 is ${sum1(10,20)}")
    sum2(10,30)
    println("10+50 = ${sum3(10,50)}")
}
```
***Output***
```
The sum of 10 and 20 is 30
10 + 30 = 40
10+50 = 60

Process finished with exit code 0
```

### Conditional Expressions
```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

/**
 * We want to find if a given number is even or odd*/

fun isEven1(a:Int):Boolean{
    if(a%2 == 0){
        return true
    }
    return false
}

fun isEven2(a:Int) = if(a%2==0) true else false

fun main(){
    println("6 is an even number: ${isEven1(6)}")
    println("7 is an even number: ${isEven2(7)}")
}```

***output***
```
6 is an even number: true
7 is an even number: false

Process finished with exit code 0```

### When Expression

`when` is like a `switch` in java and c programming languages. `when` is used when you have multiple branches and when the code looks complex with these multiple branches if used with an if condition. 

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

/**
 * I want to read input from the user.
 * for this I want to use java.util.Scanner class
 * This is a java library. can we use it kotlin as kotlin has a feature called
 * interoperability*/

import java.util.Scanner

fun main(){
    println("Choose your option\n1. Print Hello\n2. Calculate area of a rectangle")

    // Read the input from the console as the user enters it
    val s:Scanner = Scanner(System.`in`)
    val input  = s.nextInt()

    when(input){
        1 -> println("Hello World")

        2-> {
            // we are supposed to calculate the area
            println("Enter length:")
            val l = s.nextInt()
            println("Enter breadth:")
            val b = s.nextInt()
            println(l*b)
        }

        else -> println("Wrong Option! Sorry")
    }

}
```

***Output***

```
Choose your option
1. Print Hello
2. Calculate area of a rectangle
5
Wrong Option! Sorry

Process finished with exit code 0
```

[Check this doc for kotlin default imports](https://kotlinlang.org/docs/packages.html#default-imports)


#### Important 
- Please complete the below assignments before the end of Sunday (ie., 15th Oct 2023). Submit the assignments to `pavankreddy.t@gmail.com`.

**Assignment 1**   

A Certain grade of steel has to be graded according to the following conditions
- The hardness of the steel must be greater than 56
- the tensile strength of the steel must be less than 5600
- The carbon content of the steel must be greater than or equal to 0.7.

Now, read the hardness, tensile strength and carbon content of a certain steel from the user and decide the grade of the steel based on the conditions given

1. if all the conditions meet, the grade is 10
2. if only one and two are met, the grade is 9
3. if only two and three are met, the grade is 8
4. if only one and three are met, the grade is 7
5. if only one condition from among the three stated conditions are met, the grade is 6.
6. if no condition is met, the grade is 0.

***Assignment 2***
Write a program (use functions) to print the square of any given number.

***Assignment 3***
Write a program to calculate the area of a circle when the radius is entered by the user

***Assignment 4***
Write a kotlin program to print the square root of any given number.





