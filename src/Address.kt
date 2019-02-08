package theethawat.demo

class Address(name:String, street:String) {
    val city: String ="Hatyai"
    val province :String = "Songkhla"
    val addressName = name
    val addressStreet = street
    var people:Int = 0
    var merchandise:Int = 0
}

fun main(){
    var tinAddress = Address("The Duck Creator","Prachayindee")
    infoAddress(tinAddress)
    tinAddress = insertPeople(tinAddress)
    infoAddress(tinAddress)
}
fun infoAddress(inputAddress: Address){
    println("Here is your Address Information")
    println(inputAddress.addressName)
    println(inputAddress.addressStreet)
    println(inputAddress.city)
    println(inputAddress.province)
    println("There are ${inputAddress.people} people in your residence")
    println("-----------------------------------")
}
fun insertPeople(inputAddress: Address):Address{
   var userAddress = inputAddress
    println("Now There are ${userAddress.people} people in your home.")
    println("Input One")
    userAddress.people ++
    return  userAddress
}