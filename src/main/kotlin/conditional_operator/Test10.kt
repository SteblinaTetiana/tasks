package main.kotlin.conditional_operator

fun main() {
    val x = 5
    if (x<-2 || x>2){
        val fx = 2 * x
        println(fx)
    }else{
        val fx = -3 * x
        println(fx)
    }

}