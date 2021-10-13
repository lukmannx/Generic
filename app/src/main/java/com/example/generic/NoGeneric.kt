package com.example.generic

class Building(val data : Any)

fun main() {
    val dataString = Building("Pertamina")
    val valueString : String = dataString.data as String

    val dataInt = Building(10)
    val valueInt : Int = dataInt.data as Int
}