package `in`.nareshtechnologies.kotlinessentialsforandroid

data class Item(val name:String, val age:Int)

fun main(){
   val n = mutableListOf<Item>()

    n.add(Item("Raja", 62))
    n.add(Item("Rani", 34))
    n.add(Item("Pavan",12))

    n.remove(Item("Rani",34))

    n.addAll(1, listOf<Item>(Item("Priya",23), Item("Shakti", 33)))
    for(i in n){
        println("${i.name} ${i.age}")
    }


}