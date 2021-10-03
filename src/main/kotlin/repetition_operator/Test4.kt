package main.kotlin.repetition_operator

import java.lang.Math.pow
import kotlin.math.pow

fun main() {
    val a = 9
    val n = 4
    var p =1
    for(i in 1..n){
        p = p*a
        println(p)
    }
}