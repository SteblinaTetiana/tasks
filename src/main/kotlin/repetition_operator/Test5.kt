package main.kotlin.repetition_operator

fun main() {
    val n = 6
    var i = 1
    var fact = 1
    while (i<=n){
        fact = fact * i
        i = i+1
    }
    println(fact)
}