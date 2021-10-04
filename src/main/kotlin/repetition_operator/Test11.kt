package main.kotlin.repetition_operator

fun main() {
    var a = 3
    var b = 10
    while (a!=0 && b!=0){
        if(a>=b){
          a = a%b
        }else{
            b = b%a
        }
    }
    println(a+b)
}