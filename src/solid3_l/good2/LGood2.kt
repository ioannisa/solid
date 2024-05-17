package solid3_l.good2

import java.util.*
import kotlin.collections.ArrayList

// Liskov Substitution Principle (LSP)
fun main() {

    val myList1: MutableList<String> = ArrayList<String>()
    myList1.add("Hello")
    myList1.add("Array")
    printListItems(myList1)

    val myList2: MutableList<String> = LinkedList<String>()
    myList2.add("Hello")
    myList2.add("Links")
    printListItems(myList2)
}

// Function that operates on a List
fun printListItems(list: List<String>) {
    for (item in list) {
        println(item)
    }
}