package com.rizeq.kotlinbasics

fun main () {

    var age = 0

    print("Enter your age as a whole number:")

    var storeAge = readln()

    age = readln().toInt()

    if (age >= 18 && age < 40) {
        println("go in")
    }else if (age >= 40) {
        println("You cannot go into the club, please go home.")
    }else{
        println("Age not verified. Please contact support.")
    }
}