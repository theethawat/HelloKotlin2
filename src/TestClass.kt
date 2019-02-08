package theethawat.demo
/*Class structure is like java but it use the different word
    Class Contain class variable declaretion(field) , init (like constructor in java) , fun (function or method in Java)*/

 class TestClass public constructor(name: String){



    /*like field in Java (Initialization)
    We cannot use parameter that we recieve to function so that we must set as a variable before in this field
    also properties Calls the specified function block with this value as its argument and returns this value
     this code call function println this value*/

    private val nameInput = "The Input value is $name".also(::println)
    private val nameInputUpper = nameInput.toUpperCase()
    private val nameOnly = name

    /*init like Constructor in Java , they can call the function it's no public static void main*/
    init {
        println("Calling from init $nameInputUpper")
        println("Input value name is $name")
       showingMesseage(this.nameOnly)
    }



    private  fun showingMesseage(nameFunctionInput: String){
        println("Hello from Showing Messeage Function $nameFunctionInput")
    }
}

class StudentInfo(firstName:String,lastName:String,studentID:Int){
    val  Info ="His name is $firstName $lastName ID $studentID"
    init{
        showingFun(this.Info)
    }
    fun showingFun(information:String){
        println(information)
    }
}

/*Kotlin want main function to call the class?*/
fun main(){
    TestClass("theethawat")
    val id = 50;

    //Can use both value from variable or typing value
    StudentInfo("Theethawat","Savastham",150)
}
