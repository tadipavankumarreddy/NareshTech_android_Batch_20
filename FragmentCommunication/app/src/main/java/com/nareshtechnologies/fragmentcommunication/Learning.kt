package com.nareshtechnologies.fragmentcommunication

class Example(val name:String, val age:Int){
    companion object{
        fun initialize():Example{
            return Example("Pavan",32)
        }
    }
}

/*
fun main(){
    val e = Example.initialize()
    println(e.name)
}*/

class MyClass{
    companion object{
        var i = 0
        fun initialize():MyClass{
            i++
            return MyClass()
        }
    }
}

fun main(){
    val obj1 = MyClass.initialize()
    val obj2 = MyClass.initialize()
    val obj3 = MyClass.initialize()
    val obj4 = MyClass.initialize()
    val obj5 = MyClass.initialize()

    println(MyClass.i)
}