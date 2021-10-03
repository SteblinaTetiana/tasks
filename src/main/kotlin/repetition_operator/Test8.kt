package main.kotlin.repetition_operator

fun main() {
    val n = 9
    var i = 1
    var s = 1
    while (s<n){
        i = i + 1
        s = s + i
    }
    println(i)
    println(s)
}