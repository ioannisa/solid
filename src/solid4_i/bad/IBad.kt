package solid4_i.bad

fun main() {
    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeFlyableFly(eagle)       // Flying super high!
    makeFlyableFly(duck)        // Flying low
    // makeFlyableFly(penguin)  // Empty implementation, does nothing or throws exception

    // makeSwimmableSwim(eagle) // Empty implementation, does nothing or throws exception
    makeSwimmableSwim(duck)     // swim slow
    makeSwimmableSwim(penguin)  // Swimming fast!
}

// Interface for bird actions
interface BirdActions {
    fun fly() {}
    fun swim() {}
}

// Base class
open class Bird

// Subclass: Sparrow, which can fly but forced to implement swim
class Eagle : Bird(), BirdActions {
    override fun fly() {
        println("[I] Flying super high!")
    }

    override fun swim() { }
}

// Subclass: Penguin, which can swim but forced to implement fly
class Penguin : Bird(), BirdActions {
    override fun fly() { }

    override fun swim() {
        println("[I] Swimming fast!")
    }
}

class Duck : Bird(), BirdActions {
    override fun fly() {
        println("[I] Flying low!")
    }

    override fun swim() {
        println("[I] Swimming slow!")
    }
}

// Function that expects a BirdActions object and calls fly
fun makeFlyableFly(birdActions: BirdActions) {
    birdActions.fly()
}

// Function that expects a BirdActions object and calls swim
fun makeSwimmableSwim(birdActions: BirdActions) {
    birdActions.swim()
}