package main.kotlin.repetition_operator

fun main() {
    var n = 10
    var k = 3
    var dil = 0
    while (n-k>=0){
        n = n-k
        dil = dil+1
    }
    println(dil)
    println(n)
}