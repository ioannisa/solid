package solid4_i.good

fun main() {
    val sparrow = Sparrow()
    val penguin = Penguin()
    val duck = Duck()

    makeFlyableFly(sparrow)   // Flying high!
    // makeFlyableFly(penguin) // Compilation error: Penguin does not implement Flyable
    makeFlyableFly(duck)  // Flying low

    // makeSwimmableSwim(sparrow) // Compilation error: Sparrow does not implement Swimmable
    makeSwimmableSwim(penguin) // Swimming fast!
    makeSwimmableSwim(duck)  // Swimming slow
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
class Sparrow : Bird(), Flyable {
    override fun fly() {
        println("Flying high!")
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