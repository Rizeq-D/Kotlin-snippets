package com.rizeq.kotlinbasics

fun main () {

    /*
    println("Hello ma Babe")

    var myAge : Byte = 31
    println(myAge)
    myAge = 111
    println(myAge)

     */

    var age = 0

    println("Please enter your whole age in numbers")

    // giving the users an option to enter their ages
    var enteredValue = readln()
    // converting the strings into integers
    age = enteredValue.toInt()

    if (age >= 18 && age < 40) {
        println("You are allowed to enter the club")
    }else if (age >= 40){
        println("You are too old to enter, sorry!")
    }else{
        println("You are too young to enter, go to sleep!!!")
    }

}