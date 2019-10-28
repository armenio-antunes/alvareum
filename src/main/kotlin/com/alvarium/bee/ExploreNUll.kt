package com.alvarium.bee

fun addTwoNumbers(one: Double, two: Double) = one + two

fun printSomeMaths(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")
}

fun main(args: Array<String>) {
    var name: String? = null
    name = "xxx"

    println(name?.toUpperCase())
    print(addTwoNumbers(12.3, 14.5))
    printSomeMaths(12.3, 14.5)


}