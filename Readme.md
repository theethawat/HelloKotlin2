# Intro To Kotlin 
Prepare for Project Preparation
Using Ecilipse IDE and Kotlin Marketplace Extension

<b>Learn Kotlin: </b> https://kotlinlang.org/docs/reference

This is only my note during learning and coding something may be mistake.

Theethawat Savastham | Student at Prince of Songkla University Hatyai Thailand (At this moment I cannot typing in Thai in Ecilipse IDE)

## Structure
*  Don't Need a  Pre-processor because Kotlin is initial itself at the begining from IDE
* Don't worry about package name, It nescessory only to show that it are in the same domain. In file system they don't show in class view but in IDE it will show you the structure of class
* Function Initial run with main
* No Semicolon needed in Kotlin

## Basic Syntax
### printing out the word
```
//using print or println
print("Hello World")
```
### printing out the value of variable
It can be inside the double quote with $ sign using variable Name

```
print(" $variablename ")
//If have any calculating
print(" ${variableName1 + variableName2}")
```

## Function
* To call using like in C Language
* Using <b>fun</b> to initial the function

### Function Prototype

```
fun functionName(parameterName:ParameterType): Returntype{
}
```
Example for Very Basic Function (don't have return)

```
fun sum(a:Int,b:Int){
	println("a is $a  b is $b")
}
```
### Basic Function and library
* Kotlin will add Basic Library name kotlin.* if you use IDE or compiler
* There include many function inside
* String Function Reference is located at https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html

### Call function to use Return Value
In variable define or redefine

```
	var x = functionName(Parameter)
	var y:Int
	y = functionName(Parameter)
```
Beware Function and Properties are not the same
### Using the properties
In Properties we use to get something from variable you can using Kotlin Library properties
* Calling Properties

```
	var testLengthVariable = "Theethawat"
	var theethawatLength ="Theethawat".length
```
* Or calling in print statement

```
	println("Variable of testLengthVariable is ${testLengthVariable.length}")
```

## Variable
 * Using <b>val</b> can be assign a value only once
 * Using <b>var</b> can be reassign
 * Can use both Type define or not, if you not define a type you must initial value in the declare variable part and Kotlin will assign the type automatically 
 * Type Define and value Define is optional All are correct
 
 ```
 var a:Int =1
 var a = 2
 var a:Int
 ```
 * This is example that <b>Incorrect</b>
 
  ```
 var a 
 ```
 * Variable can define both in global and local (Private to function) if it be global it can be modify by any function without re parameter-initial like
 
 ```
 var x = 0
fun incrementX() { 
    x += 1 
}
 ```
 ## String Management
 ### Triming Margin
 Can use trimMargin using with prefix '|' only if use another prefix using trimMargin('Prefix')
  ```
  val str3 = """ #Hello World""".trimMargin()
  val str4 = """ #Hello World """.trimMargin("#")
  ```
  Can use ```.trimIndent ``` for trim white space before text like a white space
  and Can use triple quote """ for let string in the string can be multiple line as we code
  