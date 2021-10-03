package main.kotlin.conditional_operator

fun main() {
    val r = 2021
    if (r % 4 == 0) {
        if (r % 100 == 0) {
            if (r % 400 != 0) {
                println("365")
            } else {
                println("366")
            }
    }else{
                println("366")
            }
    }else{
                println("365")
            }
        }

