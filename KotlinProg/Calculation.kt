package com.oops
import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("Enter the first number")
    var num1=sc.nextInt()
    println("Enter the second number ")
    var num2=sc.nextInt()
    var calc=Calculation(num1,num2)
    println("Choose:\n 1.Addition\n2.Substraction\n3.Multiplication\n4.Division")
    var choice=sc.nextInt()
    when(choice){
        1->calc.A()
        2->calc.S()
        3->calc.M()
        4->calc.D()
        else->
            println("Choose correct choice")
    }
}
class Calculation(n1:Int,n2:Int){
    var n1:Int = n1
    var n2:Int = n2
    fun A():String{
        return "addition of two numbers is : ${n1+n2}"
    }
    fun S():String{
        return "Subtraction of two numbers is : ${n1 - n2}"
    }
    fun M():String{
        return "multiplication of two numbers is : ${n1*n2}"
    }
    fun D():String{
        return "Division of two numbers is : ${n1/n2}"
    }
}