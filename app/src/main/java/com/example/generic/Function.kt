package com.example.generic

class Function(val nama : String) {

    fun <t> sayHello(param : t) {
        println("Hello $param, my name is $nama")
    }
}

fun main() {
    val apaaja = Function("paik")

    apaaja.sayHello("jeki")
    apaaja.sayHello<Int>(23)
}