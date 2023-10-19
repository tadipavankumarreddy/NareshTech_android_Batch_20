package `in`.nareshtechnologies.kotlinessentialsforandroid

fun sum(a:Int, b:Int):Int{
    return a+b
}

fun sum(a:Int, b:Int, c:Int) = a+b+c

fun main(){
    println(sum(10,20))
    println(sum(10,20,30))
}
