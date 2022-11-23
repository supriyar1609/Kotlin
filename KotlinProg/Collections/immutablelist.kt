package Collections

fun main() {
    var marks = listOf<Int>(10, 34, 15, 45, 12)
    println(marks)

    for(mark in marks)
        print(marks)
println()
    println("size ${marks.size}")
    println(marks[0])
    println("first element ${marks.first()}")
    println("last element ${marks.last()}")

}