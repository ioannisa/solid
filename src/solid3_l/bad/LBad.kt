package solid3_l.bad

// Liskov Substitution using Birds
fun main() {
    val sparrow = Bird()
    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeBirdFly(sparrow)  // Flying!
    makeBirdFly(eagle)  // Flying super high!
    makeBirdFly(duck)  // Flying low!
    makeBirdFly(penguin)  // Exception: Penguins can't fly!
}


open class Bird {
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
    override fun fly() {
        println("[L] Duck is Flying low")
    }
}

// Subclass: Penguin
class Penguin : Bird() {
    override fun fly() {
        throw UnsupportedOperationException("[L] Penguins can't fly!")
    }
}

// Function that expects a Bird and calls fly
fun makeBirdFly(bird: Bird) {
    bird.fly()
}