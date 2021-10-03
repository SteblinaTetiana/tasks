package main.kotlin.string_characters

fun main() {
    val s = "My name is Tania"
    val w = s.split("\\s+".toRegex()).size
    println(w)
}