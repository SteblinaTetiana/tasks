package main.kotlin.conditional_operator

fun main() {
    val a = 7
    val b = 10
    val c = 2
    if (a>c && a>b){
        if(c>b){
            println(c)
        }else {
            println(b)
        }
    }

    if (b>a && b>c){
        if(a>c){
            println(a)
        }else{
            println(c)
        }
    }

    if (c>a && c>b){
        if(a>b){
            println(a)
        }else{
            println(b)
        }
    }

}