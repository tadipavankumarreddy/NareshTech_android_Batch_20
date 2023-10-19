package `in`.nareshtechnologies.kotlinessentialsforandroid

class Internals {
    internal var a = 10
}

fun main(){
    val i = Internals()
    println("${i.a}")
}