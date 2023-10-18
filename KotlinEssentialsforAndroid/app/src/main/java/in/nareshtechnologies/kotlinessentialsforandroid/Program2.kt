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