package theethawat.demo




interface Named{
    val name: String
}

interface Person:Named{
    val firstName : String
    val lastName : String
    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    override val firstName:String,
    override val lastName:String,
            val age: Int
):Person

fun main(){
    var tin = Employee ("Theethawat","Savastham",21)
    println(tin)
}

