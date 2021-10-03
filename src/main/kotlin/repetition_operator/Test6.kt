package main.kotlin.repetition_operator

fun main() {
    val n = 8
    var a1 = 1
    var a2 = 2
    var a3 = 3
    println(a1)
    println(a2)
    println(a3)
    for(i in 4..n){
        val a = a3
        a3 = a3 + a2 - 2*a1
        a1 = a2
        a2 = a
        println(a3)
    }

}