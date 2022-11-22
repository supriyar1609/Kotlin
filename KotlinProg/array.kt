fun main(args: Array<String>) {
    var result = myHigherOrder()
    println(result(78,99,5))

}
fun large(num1:Int, num2:Int, num3:Int): String{
    if (num1 >= num2 && num1 >= num3)
        return "$num1 is Greater"
    else if(num2>=num1 && num2>=num3)
        return "$num2 is Greater"
    else
        return "$num3 is Greater"
}
fun myHigherOrder():(Int,Int,Int)->String{
    return ::large
}