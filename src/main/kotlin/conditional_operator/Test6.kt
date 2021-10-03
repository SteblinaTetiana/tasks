package main.kotlin.conditional_operator

fun main() {
    var a = 12
    var b = 4
    if (a != b){
        a = a + b
        b = a + b

    }else {
        a = 0
        b = 0
    }
    println(a)
    println(b)
}