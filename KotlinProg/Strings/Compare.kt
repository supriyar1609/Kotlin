package Strings

fun main(args: Array<String>){
    val str1 = "Hello World!"
    val str2 = "My name is Supriya!"

    //comparing two strings
    println(str1==str2)
    println(str1!=str2)

    //checking using if else
    if (str1==str2)
        println("Strings are equal!!")
    else
        println("Strings are not equal!!")
}