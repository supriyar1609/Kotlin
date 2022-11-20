fun main(args: Array<String>) {

    var first = 50
    var second = 87

    println("Before swap:")
    println("First number = $first")
    println("Second number = $second")

    first = first - second
    second = first + second
    first = second - first

    println("After swap:")
    println("First number = $first")
    println("Second number = $second")
}