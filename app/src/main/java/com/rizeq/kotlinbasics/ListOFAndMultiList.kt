package com.rizeq.kotlinbasics

fun main() {

    /*// in an immutable list, you can not add items after the initialization
    val shoppingList1 = listOf("Processor", "RAM", "Graphic Card", "SSD")

    // but with the mutable list, you can add items after the initialization
    val shoppingList2 = mutableListOf("Processor", "RAM", "Graphic Card 3060", "SSD")

    // adding to it
    shoppingList2.add("Cooling System")
    shoppingList2.add("Graphic Card 4090")

    // removing from it
    shoppingList2.remove("Graphic Card 3060")

    shoppingList2[4] = ("Graphic card RX 7800XT")

    shoppingList2.set(3, "Water Cooling")

    val theElement = "ram"

    val hasItem = shoppingList2.any { it.equals(theElement, ignoreCase = true) }
    if (hasItem) {
        println("the list contains RAMs")
    }else{
        println("the list does not contain RAMs")
    }
    println(shoppingList2)*/

    //------------------------------------------------------------------------------------

    val fruitsList = mutableListOf("Banana", "Orange", "Strawberry", "BlackBerry", "WaterMelon" , "Melon")
    println(fruitsList)

    fruitsList.add("Kiwi")
    println(fruitsList)

    fruitsList.remove("Kiwi")
    println(fruitsList)

    val items = "melon"
    fruitsList.removeIf { it.equals(items, ignoreCase = true) }
    println(fruitsList)

    val checkItem = "strawberry"
    val containItem = fruitsList.any { it.equals(checkItem, ignoreCase = true) }
    if (containItem) {
        println("the list has $checkItem")
    }else{
        println("the list does not have $checkItem")
    }

    /*for (item in fruitsList) {
        println(item)
        if (fruitsList.any { it.equals("orange", ignoreCase = true) }) {
            break
        }
    }
*/
    println(fruitsList)

    for (index in 0 until fruitsList.size) {
        println("item ${fruitsList[index]} has the index $index ")
    }

    for (index in 0 .. 4) {
        println("item ${fruitsList[index]} has the index $index ")
    }























}