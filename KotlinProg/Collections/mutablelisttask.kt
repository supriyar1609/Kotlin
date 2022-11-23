package Collections

fun main(){

    var javabatch = mutableListOf<String>("Anil", "Gopal", "Ankit", "Manish")
    var kotlinbatch = mutableListOf<String>("Ankit", "Kumar", "Manish", "Rahul")

    //combine in one batch
    javabatch.addAll(kotlinbatch)
    println("After combining $javabatch")

    //remove duplicate
    javabatch.removeAll(kotlinbatch)
    println("After removing duplicate $kotlinbatch")

    //sort data in ascending order
    javabatch.sort()
    kotlinbatch.sort()
    println("Java Batch after sorting: $javabatch")
    println("Kotlin Batch after sorting: $kotlinbatch")


}