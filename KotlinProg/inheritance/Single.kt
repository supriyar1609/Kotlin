package inheritance

open class Bird {
    fun fly() {
        println("A bird Flies")
    }
}
class Duck: Bird() {
    fun swim() {
        println("A duck can swim!")
    }
}
fun main(args: Array<String>) {
    val duck = Duck()
    duck.fly()
    duck.swim()
}