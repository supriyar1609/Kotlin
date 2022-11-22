package Strings

fun main(args: Array<String>) {
    val text1 = """Harry Potter is  
        |a seven part story  
        |Written by JK Rowling
        """
    println(text1)

  /*  val text = """Harry Potter is
        |a seven part story 
        |Written by JK Rowling
    """.trimMargin()*/
println("String after using the trim function")
   val text = text1.trimMargin()
    println(text)
}