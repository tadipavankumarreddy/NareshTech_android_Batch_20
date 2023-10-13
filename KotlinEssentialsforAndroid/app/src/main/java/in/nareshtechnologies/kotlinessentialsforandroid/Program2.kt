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