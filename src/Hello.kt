package theethawat.demo



fun main(){
    //String
    val str1 ="HelloWorld"
    val str2= "Hello" + "World"
    //TrimMargin using with prefix '|' only if use another prefix using trimMargin('Prefix')
    val str3 = """ #Hello World""".trimMargin()
    val str4 = """ #Hello World """.trimMargin("#")
    println("$str3 and $str4")
    //triple quote """ can use for multiple line or
    // any string attribute not nescessrory to use \n \t or any
    var str5 ="""
        Hello How are you?
        I'm fine thank you
    """.trimIndent()
    //trimIndent Use for trim white space before text
    var str6 = "Hello \n How are You"
    println("String 5 is $str5  \n String 6 is $str6")
    println(str1 == str2 )
    //Using Like Charecter Array
    println(str6[0])
}