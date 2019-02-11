package theethawat.demo

interface MyInterface{
    val prop:Int

    val propertyWithImplementation: String
        get() = "foo"



    fun foo(){
        print(prop)
    }
}

class Child : MyInterface{
    override  val prop :Int = 29
    init {
        foo()
    }
}

fun main(){
    Child()
    println("Function have complete working")
}