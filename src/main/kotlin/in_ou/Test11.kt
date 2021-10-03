package main.kotlin.in_ou

import java.lang.Math.sqrt

fun main(){
    val a = 4
    val b = 7
    val d = a * a
    val f = b * b
    val c = sqrt((d + f).toDouble())
    val p = a + b + c
    println(c)
    println(p)
}