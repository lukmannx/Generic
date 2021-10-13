package com.example.generic

/*secara default, saat kita membuat generic paramerer type,
sifat parameter tersebut adalah invariant
Invariant = tidak  boleh subtitusi subtype(child) atau supertype*/

class Invariant<t> (val data : t)

fun main() {
    val data1 : Invariant<String> = Invariant("torik")
//    val data2 :Invariant<Any> = data1
}