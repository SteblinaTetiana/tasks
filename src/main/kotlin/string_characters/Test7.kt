package main.kotlin.string_characters

fun main() {
    var s = "145"
    val a = s.toList()
    val num = a.map {it.toString().toInt()}
    println(num.sum())

}