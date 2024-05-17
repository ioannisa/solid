package solid3_l.good

// Liskov Substitution using Birds
fun main() {
    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeBirdFly(eagle)      // Flying super high!
    makeBirdFly(duck)       // Flying low!
    //makeBirdFly(penguin)    // code doesn't allow us to define this line
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
class Penguin : Bird() {
    override fun walk() {
        println("[L] Penguin is walking funny")
    }
}
