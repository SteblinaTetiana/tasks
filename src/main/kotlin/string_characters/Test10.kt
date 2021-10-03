package main.kotlin.string_characters

fun main() {
    val text = "ABBA"
    val text1 = "kazak"
    val revers = text.reversed()
    val revers1 = text1.reversed()
    if (text==revers){
        println("Polindrom")
    } else{
        println("Not Polindrom")
    }
        if(text1 == revers1){
            println("Polindrom")
        }else{
            println("Not Polindrom")
    }
}