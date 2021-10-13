package com.example.generic
/*Contravariant artinya kita bisa melakukan subtitusi supertype dengan subtype
tidak semua jenis class generic yang mendukung contravariant, hanya kelas generid yang
menggunakan generic parameter function*/

class Contravariant<in T> {
    fun sayHello(name : T){
        return println("Hello $name")
    }
}

fun main() {
    val data1 : Contravariant<Any> = Contravariant()
    val data2 : Contravariant<String> = data1

    data1.sayHello(4.2)
}
