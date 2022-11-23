package Collections

fun main(){
    var marks = mutableListOf<Int>(20,30,40,20)
    println(marks)

    marks.add(50)
    marks.add(34)
    println(marks)
    println("size ${marks.size}")
    println("contains 200 ${marks.contains(200)}")
    marks.remove(2)
    println(marks)
    marks.remove(30)
    println(marks)

   // marks.clear()
   // println(marks)
    marks.add(1,25)
    println("after adding element in the index")
    println(marks)

}