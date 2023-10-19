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

### Loops in Kotlin

When you want to repeat a set of statements for some number of times or till the condition fails, we can employ loops. 

`in` -> is a keyword in kotlin that works with range of values or a collection.

**the `for` loop in kotlin**

```kotlin
fun main() {
    for(i in 1..10){
        println("Pavan")
    }
}
```

`..` -> this defines the range.
1..10 -> it means 1 to 10

***print all the numbers between 23 to 45.

```kotlin
fun main() {
    for(i in 23..45){
        println("$i")
    }
}
```

***print all the even numbers between the given range***

```kotlin
    package `in`.nareshtechnologies.kotlinessentialsforandroid

    import java.util.Scanner

    fun main(){
        println("Enter the lower bound: ")
        val s:Scanner = Scanner(System.`in`)
        val lb = s.nextInt()

        println("Enter the upper bound: ")
        val ub = s.nextInt()

        for(i in lb..ub){
            if(i%2 == 0){
                println(i)
            }
        }

    }
```
`downTo` is a keyword that lets you come from an upper bound to a lower bound (By default, the loop counter (ie., i in the following example))decreases the value by 1 every time the loop executes.

```kotlin

fun main(){
	for(i in 10 downTo 1){
        println("$i")
    }
}
```

```kotlin
/**
 * Program to print all the odd numbers between 1 and 100*/

fun main(){
    for(i in 3..100 step 2){
        println("$i")
    }
}
```

`step` is a keyword in kotlin that helps you increase the increment or decrement value of the loop counter (ie., i in this case).

```kotlin
/**
 * Print the even numbers from 100 to 50 in reverse order*/

fun main(){
    for(i in 100 downTo 50 step 2){
        println("$i")
    }
}
```

`while` & `do-while` works the same way as the ones we have in `c`, `c++`, `Java` & `python`.

```kotlin
/**
 * program to print 1 to 10 and 10 to 1*/

fun main(){
    var i = 10
    while(i>=1){
        print("$i ")
        i-- // -- is a decrement operator
    }
    
    println()
    
    do{
        print("$i ")
        i++
    }while(i<=10)
}
```

***Please submit the test by 10:00PM today***

***repeat - ibuilt function***
```kotlin
fun main(){
    repeat(10){
        println("Pavan")
    }
}
```

### Arrays in kotlin

Array is one of the most fundamental data structure in practically all programming languages. The idea behind an array is to store multiple items of teh same data type, such as integers or strings under a single variable name. 

Arrays are used to organize data in programming so that a related set of values can easily be stored or searched for. 

***Important properties to make a note of***

1. They are stored in contigeous memory locations.
2. They can be accessed programmatically through their indices. 
3. They are mutable.
4. Their size is fixed. 
5. The index of an array starts at 0 and ends at 1 less than the actual size. 

***Create an array with the help of `arrayOf()` & `arrayOf<>()` functions. 

```kotlin
fun main(){
    var a = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("the size of an array is ${a.size}")
   
  	/**
  	 * Access the 5th element in the array*/
     println(a[4])
     
     println(a[0])
     
     a[0] = 89
    
    println(a[0])
    
    /**
     * You have a predefined function called set() to set a value on a particular index you specify*/
     
     a.set(5,78)
     
     println(a[5])
}
```

```kotlin
fun main(){
    var a = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("the size of an array is ${a.size}")
   
  	/**
  	 * Can we print all the items present in an array ?*/
     for(i in 0..(a.size-1)){
         print("${a[i]} ")
     }
     println()
     
     for(i in a){ // i in a represents each value of a copied to i
         print("$i ")
     }
     println()
     println(a.get(6)) // just like we have set method, we also have get() method that gets the value at a certain index that you specify
}
```

```kotlin
fun main(){
    var a = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
    println("the size of an array is ${a.size}")
   
  	/**
  	 * Can we print all the items present in an array ?*/
     for(i in 0..(a.size-1)){
         print("${a[i]} ")
     }
     println()
     
     for(i in a){ // i in a represents each value of a copied to i
         print("$i ")
     }
     println()
     println(a.get(6)) // just like we have set method, we also have get() method that gets the value at a certain index that you specify
}
```

```kotlin
fun main(){
    var s = arrayOf<String>("Naresh", "IT","Technologies","Hyderabad")
    for(i in s){
        print("$i ")
    }
}
```

***Assignments***
- Write a program to print the fibnocci series till the given number. if the given number is not a part of fibnocci series, print the fibnocci series till the nearest number of the given number. 
- Write a program to print the average of all the values given in an array.

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

import java.util.Scanner
fun main(){
    println("Enter the Lower Bound:")
    val s = Scanner(System.`in`)
    val lb = s.nextInt()
    println("Enter the Upper Bound:")
    val ub = s.nextInt()

    var count = 0
    for(i in lb..ub){
        if(i == 1){
            println("$i is neither prime or composite")
        }else if(primeOrNot(i)){
            count++
            print("$i ")
        }
    }

    println()
    print("The total number of prime numbers identified are $count")
}

/**
 * What is a prime number ?
 * a Number that has only two factors (ie., 1 and itself) is called a prime number
 * */

fun primeOrNot(a:Int):Boolean{
    // Identify the total number of factors that a number has
    for(i in 2..(a-1)){
        if(a%i==0){
            return false
        }
    }
    return true
}
```

***Assignment***
- Find all the palindromic prime numbers between a given range.

- Find the sum of the individual digits in a prime number and print those prime numbers that has the sum of their digits becoming prime number.

### Using Array() constructor 

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

import java.util.Scanner
fun main(){
    println("Enter the size of the array")
    val s = Scanner(System.`in`)
    val l = s.nextInt()

    var a = Array<Int>(l,{i->i*1})

    var i = 0
    while (i<a.size){
        println("Enter the Array Value:")
        val n = s.nextInt()
        a[i] = n
        i++
    }

    for(j in a){
        print("$j ")
    }
}
```

### OOPs in Kotlin
OOP Stands for Object Oriented Programming. 

Procedural Programming is about writing the procedures or methods that operates on Data. While, OOP is about creating Objects that contain both data and methods.

Advantages:
- Faster and easier to execute
- Provides clear structure of the program
- OOP helps to keep the kotlin code DRY(Do not Repeat Yourself).
- Reusability.

Kotlin Objects & Classes:

- Any Object in the real world entity that can have attributes and behavior. An Object is an instance (copy) of a class. 
- A class is a blueprint of an Object.

***Unlike java, Kotlin is null safe. That is the reason, the variables that you declare must be initialized or they can also accept null values if you specify explicitly with `?= `combination.***

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

/**
 * Dog -> real World Entity to be programmed
 * 3 Attributes
 *  - name , age and weight
 *  display()
 *      - name age and weight*/

class Dog{
    var name:String ? = null
    var age:Int ? =null
    var weight:Double ? =null

    fun display(){
        println("$name of age $age is with weight $weight")
    }
}

fun main(){
    val d = Dog() // this is how we create an object
    d.name = "Tommy"
    d.age = 12
    d.weight = 34.45

    val j = Dog() // this is how we create an object
    j.name = "Jimmy"
    j.age = 14
    j.weight = 4.45
    // Both d and j are independent of each other
    j.display()
    d.display()
}

```

***output***
```
Jimmy of age 14 is with weight 4.45
Tommy of age 12 is with weight 34.45

Process finished with exit code 0
```

### Constructors in kotlin
```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

/**
 * Dog -> real World Entity to be programmed
 * 3 Attributes
 *  - name , age and weight
 *  display()
 *      - name age and weight*/

class Dog(var name:String?,var age:Int?,var weight:Double?){

    fun display(){
        println("$name of age $age is with weight $weight")
    }
}

fun main(){
    val d = Dog("Tommy",12,34.45) // this is how we create an object

    val j = Dog("Jimmy",14,4.45) // this is how we create an object
    
    // Both d and j are independent of each other
    j.display()
    d.display()
}

```

***output***
```
Jimmy of age 14 is with weight 4.45
Tommy of age 12 is with weight 34.45

Process finished with exit code 0
```

***Overloading Constructors in Kotlin**

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

/**
 * Dog -> real World Entity to be programmed
 * 3 Attributes
 *  - name , age and weight
 *  display()
 *      - name age and weight*/

class Dog(var name:String?,var age:Int?,var weight:Double?){

    constructor(name:String):this(name,23,22.45)
    constructor(name:String, age:Int):this(name, age, 12.34)
    fun display(){
        println("$name of age $age is with weight $weight")
    }
}

fun main(){
    val d = Dog("Tommy",12,34.45) // this is how we create an object

    val j = Dog("Jimmy",14,4.45) // this is how we create an object

    val k = Dog("Rocky")

    val l = Dog("Saggie",13)
    // Both d and j are independent of each other
    j.display()
    d.display()
    k.display()
    l.display()
}
```

***output**
```
Jimmy of age 14 is with weight 4.45
Tommy of age 12 is with weight 34.45
Rocky of age 23 is with weight 22.45
Saggie of age 13 is with weight 12.34

Process finished with exit code 0
```

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

import java.util.WeakHashMap

/**
 * Dog -> real World Entity to be programmed
 * 3 Attributes
 *  - name , age and weight
 *  display()
 *      - name age and weight*/

class Dog{
    var name:String?=null
    var age:Int?=null
    var weight:Double?=null

    constructor(n:String, a:Int, w:Double){
        name = n
        age = a
        weight = w
    }
    constructor(name:String):this(name,23,22.45)
    constructor(name:String, age:Int):this(name, age, 12.34)
    fun display(){
        println("$name of age $age is with weight $weight")
    }
}

fun main(){
    val d = Dog("Tommy",12,34.45) // this is how we create an object

    val j = Dog("Jimmy",14,4.45) // this is how we create an object

    val k = Dog("Rocky")

    val l = Dog("Saggie",13)
    // Both d and j are independent of each other
    j.display()
    d.display()
    k.display()
    l.display()
}

```

***Output remains the same as above***

```Favorite Movie Names
a -> Avengers End Game
b -> Bahubali
c -> Captain America
d -> Don
e -> Elementals
f -> Fast and Furious
g -> Godfather
h -> Hulk
i -> Incredibles
J -> Joker
```

### Inheritance in kotlin
This is another fundamentally very important concepts in OOPs. Inheritance is the process of acquiring the properties and behaviors of one class into another class.

Inheritance is fundamentally used for code re-usuability. 

***Important Note*** All classes in kotlin have a common super class, `Any`, which is the default super class for a class with no super class defined. 

```kotlin
class Pavan{
    // the default super class is Any
}
```

`Any` class has got three methods
- equals()
- hashCode()
- toString()

Hence, these methods are present in any class that you create.

```koltin
package `in`.nareshtechnologies.kotlinessentialsforandroid

import java.util.WeakHashMap

/**
 * Dog -> real World Entity to be programmed
 * 3 Attributes
 *  - name , age and weight
 *  display()
 *      - name age and weight*/

class Dog{
    var name:String?=null
    var age:Int?=null
    var weight:Double?=null

    constructor(n:String, a:Int, w:Double){
        name = n
        age = a
        weight = w
    }
    constructor(name:String):this(name,23,22.45)
    constructor(name:String, age:Int):this(name, age, 12.34)
    fun display(){
        println("$name of age $age is with weight $weight")
    }
}

fun main(){
    val d = Dog("Tommy",12,34.45) // this is how we create an object

    val j = Dog("Jimmy",14,4.45) // this is how we create an object

    val k = Dog("Rocky")

    val l = Dog("Saggie",13)
    // Both d and j are independent of each other
    j.display()
    d.display()
    k.display()
    l.display()

    println(j.hashCode())
    println(j.equals(d))
    println(j.toString())
}

```

***output***
```
Jimmy of age 14 is with weight 4.45
Tommy of age 12 is with weight 34.45
Rocky of age 23 is with weight 22.45
Saggie of age 13 is with weight 12.34
718231523
false
in.nareshtechnologies.kotlinessentialsforandroid.Dog@2acf57e3

Process finished with exit code 0

```

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

import java.util.WeakHashMap

/**
 * Dog -> real World Entity to be programmed
 * 3 Attributes
 *  - name , age and weight
 *  display()
 *      - name age and weight*/

class Dog{
    var name:String?=null
    var age:Int?=null
    var weight:Double?=null

    constructor(n:String, a:Int, w:Double){
        name = n
        age = a
        weight = w
    }
    constructor(name:String):this(name,23,22.45)
    constructor(name:String, age:Int):this(name, age, 12.34)
    fun display(){
        println("$name of age $age is with weight $weight")
    }
}

fun main(){
    val d = Dog("Tommy",12,34.45) // this is how we create an object

    val j = Dog("Jimmy",14,4.45) // this is how we create an object

    val k = Dog("Rocky")

    val l = Dog("Saggie",13)

    val h = j

    h.name = "Rummy"
    // Both d and j are independent of each other
    j.display()
    d.display()
    k.display()
    l.display()

    println(j.hashCode())
    println(j.equals(h))
    println("${j.toString()} ${h.toString()}")
    println("${j.hashCode()} ${h.hashCode()}")
}

```
***output***
```
Rummy of age 14 is with weight 4.45
Tommy of age 12 is with weight 34.45
Rocky of age 23 is with weight 22.45
Saggie of age 13 is with weight 12.34
718231523
true
in.nareshtechnologies.kotlinessentialsforandroid.Dog@2acf57e3 in.nareshtechnologies.kotlinessentialsforandroid.Dog@2acf57e3
718231523 718231523
```

***Important Point***: In Kotlin, by default, all classes are final. Meaning, we cannot subclass a class by default. In order to subclass a class, declare the class with `open` keyword.

```kotlin
class Example // this class is final. not open for inheritance
```

open class Example // This class is open for inheritance.```

In java, we use `extends` keyword to inherit a class to another class. In Kotlin, we have `:` operator doing the job of `extends`.

```kotlin
open class Base(p:Int)
class Derived(p:Int):Base(p)
```

```koltin
package `in`.nareshtechnologies.kotlinessentialsforandroid

open class A(var name:String?,var age:Int?){
    fun display(){
        println("$name , $age")
    }
}

class B(var n:String?,var a:Int?, var salary:Int?):A(n,a){
    fun display2(){
        display()
        print(salary)
    }
}

fun main(){
    val b = B("Pavan",18,10000)
    b.display2()
}
```

```
Pavan , 18
10000
Process finished with exit code 0
```

### Encapsulation
Encapsulation is a fundamental concept in OOPs. Encapsulation refers to the bundling of data and methods that operate on the data with in a single unit, is called as class. 

Encapsulation is a way to hide the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class. 

***Modifiers in kotlin***

- ***private*** - the element that is declared private cannot be accessed from outside of the kotlin file that is defined in. These elements can only accessed in the same place where they are defined. 
  
- ***public*** - Elements are accessed from anywhere
  
- ***protected*** - same as private except that subclasses can access the class/interface elements.
  
- ***internal*** - Anything in the module can access these elements. 

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

open class Hello{
    var a = 10
    var b = "Pavan"
}

class Hai :Hello(){
    fun display(){
        println("$a & $b")
    }
}

fun main(){
    val h = Hai()
    h.display()
}
```

***output***
```
10 & Pavan
```

```kotlin
package `in`.nareshtechnologies.kotlinessentialsforandroid

class Internals {
    internal var a = 10
}

fun main(){
    val i = Internals()
    println("${i.a}")
}
```

```
package `in`.nareshtechnologies.kotlinessentialsforandroid

fun main(){
    val i = Internals()
    i.a = 90
    println(i.a)
}
```

***If a class with a certain functionality is defined in a different package and the elements in the class are accessible either directly (if they are declared as public) or with the help of helper methods (incase of private, protected modifiers), you write the import statement to import that module or a specific class***

***If a class in the same module (Package) needs to be accessed, you can access it directly. No need import statements***












