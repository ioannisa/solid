package solid4_i.good

fun main() {
    val eagle = Eagle()
    val penguin = Penguin()
    val duck = Duck()

    makeFlyableFly(eagle)        // Flying super high!
    makeFlyableFly(duck)         // Flying low
    // makeFlyableFly(penguin)   // Compilation error: Penguin does not implement Flyable

    // makeSwimmableSwim(eagle)  // Compilation error: Sparrow does not implement Swimmable
    makeSwimmableSwim(duck)      // Swimming slow
    makeSwimmableSwim(penguin)   // Swimming fast!
}

// Interface for flyable actions
interface Flyable {
    fun fly()
}

// Interface for swimmable actions
interface Swimmable {
    fun swim()
}

// Base class
open class Bird

// Subclass: Sparrow, which can fly
class Eagle : Bird(), Flyable {
    override fun fly() {
        println("Flying super high!")
    }
}

// Subclass: Penguin, which can swim
class Penguin : Bird(), Swimmable {
    override fun swim() {
        println("Swimming fast!")
    }
}

// Subclass: Duck, which can both fly and swim
class Duck : Bird(), Flyable, Swimmable {
    override fun fly() {
        println("Flying low!")
    }

    override fun swim() {
        println("Swimming slow!")
    }
}

// Function that expects a Flyable object and calls fly
fun makeFlyableFly(flyable: Flyable) {
    flyable.fly()
}

// Function that expects a Swimmable object and calls swim
fun makeSwimmableSwim(swimmable: Swimmable) {
    swimmable.swim()
}