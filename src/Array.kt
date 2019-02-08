package theethawat.demo



fun main(){
   //Can Creating Array with Initial Value , Initial Value Using Function or uninitialized
    //using Normal 'arrayOf' if you initial value
    val a = intArrayOf(11,13,15,17,12)
    //Non Nessecery to declare a variable if you want only to indexing a loop not like C
    for(i in 0..4){
        println(a[i])
    }
    //Specific Array type
   /*
    BooleanArray booleanArrayOf(true, false) boolean[]
    ByteArray byteArrayOf(1, 2, 3) byte[]
    CharArray charArrayOf('a', 'b', 'c') char[]
    DoubleArray doubleArrayOf(1.2, 5.0) double[]
    FloatArray floatArrayOf(1.2, 5.0) float[]
    IntArray intArrayOf(1, 2, 3) int[]
    LongArray longArrayOf(1, 2, 3) long[]
    ShortArray shortArrayOf(1, 2, 3) short[] */

    //Trying Array Properties
    println("Trying the properties of Array")
    //Setting When Declare an array
    // sortedArray(), sortedArrayDescending() use when declare or process?
    var b = intArrayOf(11,13,15,17,12).sortedArrayDescending()
    for(i in 0..4){
        println(b[i])
    }
    // using sort(), sortDescending() , min(), max(),first(), last() in view
    println("The Minimum of Array B is ${b.min()}")
    println("List of Array B is ${b.sorted()}")

    val asc = Array(5,init = {i->i+1})
    for (b in asc){
        println(b)
    }
    println("Collection Testing")
    //Collection List Map Set

    //List
    val  myList = listOf<String>("Theethawat","Songpon","Sirinuch","Theematach")
    println(myList)
    println(myList[1])

    //Map (Map value with the element)
    //Define the type that you want to Map them like index is 'int' and name is 'string'
    //Use keyword Pair
    val myMap = mapOf<Int,String>(Pair(1,"Theethawat"), Pair(2,"Theematach"),Pair(3,"Songpon"), Pair(4,"Sirinuch"))
    println(myMap)
    //Specific
    println("MyMap 4 is ${myMap[4]}")
    //Using Set
    val mySet = setOf<String>("Theethawat","Savastham")
    println(mySet)
}