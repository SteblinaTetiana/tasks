package main.kotlin.in_ou

import java.lang.Math.abs

fun main(){
    val x1 = 2
    val y1 = 6
    val x2 = 5
    val y2 = 7
    val ab = abs(y2-y1)
    val bc = abs(x2-x1)
    val p = 2 * (ab*bc)
    val s = ab*bc
    println(p)
    println(s)

}