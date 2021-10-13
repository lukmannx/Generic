package com.example.generic
/*Terkadang kita ingin membatasi data yang boleh digunakan di generic parameter typer
kita bisa menambahkan constrain di generic parameter type dengan menyebutkan type yg diperbolehkan
secara otomatis, type data yang bisa digunakan adalah type yg sudah kita sebutkan
secara default constrain type untuk generic parameter type adalah any, sehingga ssemua tipe data bisa digunakan*/

open class Employe

class Manager : Employe()

class VicePresident : Employe()

class Company<T : Employe>(val employe: T)

fun main() {
    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
}