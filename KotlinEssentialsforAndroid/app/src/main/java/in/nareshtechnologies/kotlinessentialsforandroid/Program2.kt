package `in`.nareshtechnologies.kotlinessentialsforandroid

open class Hello{
    private var a = 10
    private var b = "Pavan"

    fun setValue(num:Int, name:String){
        a = num
        b = name
    }

    fun getValue():String{
        return "$a & $b"
    }
}

class Hai :Hello(){
    fun display(){
        setValue(20,"Kumar")
        println(getValue())
    }
}

fun main(){
    val h = Hai()
    h.display()
}