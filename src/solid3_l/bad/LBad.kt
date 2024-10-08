package solid3_l.bad

// Liskov Substitution Principle (LSP)
fun main() {
    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeBirdFly(eagle)      // Flying super high!
    makeBirdFly(duck)       // Flying low!
    makeBirdFly(penguin)    // Exception: Penguins can't fly!
}

// Function that expects a Bird and calls fly
fun makeBirdFly(bird: Bird) {
    bird.fly()
}

open class Bird {
    open fun walk() {
        println("[L] Walking!")
    }

    open fun fly() {
        println("[L] Flying!")
    }
}

class Eagle : Bird() {
    override fun fly() {
        println("[L] Flying super high!")
    }
}

class Duck : Bird() {
    override fun walk() {
        println("[L] Duck is walking slow")
    }

    override fun fly() {
        println("[L] Duck is Flying low")
    }
}

class Penguin : Bird() {
    override fun walk() {
        println("[L] Penguin is walking funny")
    }

    override fun fly() {
        throw UnsupportedOperationException("[L] Penguins can't fly!")
    }
}
