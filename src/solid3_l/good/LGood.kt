package solid3_l.good

// Liskov Substitution using Birds
fun main() {
    val sparrow = Sparrow()
    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeBirdFly(sparrow)
    makeBirdFly(eagle)
    makeBirdFly(duck)
    //makeBirdFly(penguin)
}

// Function that expects a Flyable bird and calls fly
fun makeBirdFly(flyable: Flyable) {
    flyable.fly()
}

// Interface for flying behavior
interface Flyable {
    fun fly()
}

// Base class
open class Bird {
    open fun walk() {
        println("[L] Walking!")
    }
}

// Subclass: Sparrow, which can fly
class Sparrow : Bird(), Flyable {
    override fun fly() {
        println("[L] Flying!")
    }
}

// Subclass: Eagle, which can fly
class Eagle : Bird(), Flyable {
    override fun fly() {
        println("[L] Eagle is Flying supper high!")
    }
}

// Subclass: Duck, which can fly
class Duck : Bird(), Flyable {
    override fun walk() {
        println("[L] Duck is walking funny")
    }

    override fun fly() {
        println("[L] Eagle is Flying low!")
    }
}

// Subclass: Penguin, which cannot fly
class Penguin : Bird()
