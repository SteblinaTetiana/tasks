package main.kotlin.conditional_operator

fun main() {
    val n = -5
    if (n>0){
        println(n + 1)
    }else if (n<0){
        println(n-2)
    }else {
        println(10)
    }
}