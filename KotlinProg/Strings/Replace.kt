package Strings

fun main(args: Array<String>) {

    var str = "Supriya Raghunath"
    val oldValue = "RAGHUNATH" //to replace we have to give it in Upper Case
    val newValue = "R"

    val output = str.replace(oldValue, newValue, ignoreCase = true)
    val output1 = str.replace(oldValue, newValue, ignoreCase = false)

    println(output)
    println(output1)
}