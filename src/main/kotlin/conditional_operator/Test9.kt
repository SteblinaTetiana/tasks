package main.kotlin.conditional_operator

fun main() {
    val a = 11
    val b = 25
    val c = 6
    if (a>b && b>c){
        println(a+b)
    }else if(a<c && c<b){
        println(a+c)
    }else{
        println(b+c)
    }
}