package main.kotlin.conditional_operator

fun main() {
    val x = 13
    if(x<=0){
        val f = -x
        println(f)
    } else if(x>0 && x<2){
       val f = x*x
        println(f)
    }else if(x>=2){
        val f = 4
        println(f)
    }

}