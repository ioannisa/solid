package solid4_i.bad

fun main() {
    val sparrow = Sparrow()
    val penguin = Penguin()
    val duck = Duck()

    makeFlyableFly(sparrow)   // Flying high!
    // makeFlyableFly(penguin) // Throws UnsupportedOperationException: Penguin cannot fly!
    makeFlyableFly(duck)  // Flying low

    // makeSwimmableSwim(sparrow) // Throws UnsupportedOperationException: Sparrow cannot swim!
    makeSwimmableSwim(penguin) // Swimming fast!
    makeSwimmableSwim(duck)  // swim slow
}


// Interface for bird actions
interface BirdActions {
    fun fly() {}
    fun swim() {}
}

// Base class
open class Bird

// Subclass: Sparrow, which can fly but forced to implement swim
class Sparrow : Bird(), BirdActions {
    override fun fly() {
        println("[I] Flying high!")
    }

    override fun swim() {
        throw UnsupportedOperationException("[I] Sparrow cannot swim!")
    }
}

// Subclass: Penguin, which can swim but forced to implement fly
class Penguin : Bird(), BirdActions {
    override fun fly() {
        throw UnsupportedOperationException("[I] Penguin cannot fly!")
    }

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