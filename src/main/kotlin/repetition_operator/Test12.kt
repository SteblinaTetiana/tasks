package main.kotlin.repetition_operator

fun main() {
    val n = 15
    var f1 = 1
    var f2 = 1
   while(n>f2){
       val f = f2
       f2 = f1 + f2
       f1 = f
   }

    if(n==f2){
           println("True")
       }else{
           println("False")
       }

}