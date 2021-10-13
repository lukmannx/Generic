package com.example.generic

//Covariant artinya kita melakukan subtitusi subtype(child) dengan supertype(parent)
//tidak semua jeis class genetik yang mendukung covariant, hanya class generic yang menggunakan
//untuk kata kuncinya kita akan menggunakan out
class Covariant<out T> (val data : T) {

    fun data() : T {
        return data
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("Lukman")
    val data2 : Covariant<Any> = data1
}