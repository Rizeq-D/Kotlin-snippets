package com.rizeq.kotlinbasics

fun main () {

    println("Please enter the first number:")
    val number1 = readln().toInt()

    print("Please enter the second number to add it to the first one:")
    val number2 = readln().toInt()

    //val resutls = number1 + number2
    //println("the results are: $resutls")

    val divResults = number1 / number2.toDouble()
    println("the results are: $divResults")

}