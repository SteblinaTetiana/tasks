package main.kotlin.in_ou

import java.lang.Math.sqrt

fun main(){
    val x1 = 1
    val y1 = 5
    val x2 = 9
    val y2 = 7
    val x = (x2-x1)*(x2-x1)
    val y =(y2-y1)*(y2-y1)
    val v = sqrt((x+y).toDouble())
    println(v)
}