package com.mihk.game

class FizzBuzz {
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
    println()

    for (i in 1000 downTo 500 step 47) {
        print(fizzBuzz(i))
    }
}
