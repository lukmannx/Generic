package com.example.generic

class Building2<T, u>(val data : T, val secondData : u) {
    fun prinData() {
        return println("Data is $data $secondData")
    }
}

fun main() {
    val dataStringg = Building2<String, Int>("pertamina", 2)

    val dataString : Building2<Int, String> = Building2(3, "dakta")

    val dataInt = Building2(true, 4.2)

    dataStringg.prinData()
    dataString.prinData()
    dataInt.prinData()
}