package com.rizeq.kotlinbasics

fun main() {

    var numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    println(numbers)

    for (index in 0 until numbers.size) {
        println("item ${numbers[index]} has the index of $index")
    }

    println("I am gonna double each element in the list")
    for (i in numbers.indices) {
        numbers[i] = numbers[i] * 2
    }
    println(numbers)
}