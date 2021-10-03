package main.kotlin.conditional_operator

fun main() {
    val a = 5
    val b = 9
    val c = 3
    if (a<b && a<c){
        println(a)
    }else if(b<c){
        println(b)
    }else{
        println(c)
    }

}