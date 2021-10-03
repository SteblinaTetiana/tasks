package main.kotlin.repetition_operator

fun main() {
    val p = 5F
    var sum = 1000F
    var k = 1
    while (sum<=1100){
       sum = sum * (p/100 + 1)
        k = k+1
    }
    println(k)
    println(sum)
}