package main.kotlin.repetition_operator

fun main() {
    var n = 150
    while (n>0) {
       var r = n%10
        n = n/10
        println("$r, $n")
    }
    }
