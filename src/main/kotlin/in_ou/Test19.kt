package main.kotlin.in_ou

fun main(){
    var a = 3
    var b = 6
    var c = 1

    a = a - b
    b = a + b
    a = b - a
    c = c - a
    a = c + a
    c = a - c

    println(a)
    println(b)
    println(c)

}