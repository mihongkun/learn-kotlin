package chap02

fun main(args: Array<String>) {
    val answer = "Hello"
    val answer1: String = "World"

    val yearsToCompute: Double = 7.6e6

    println("answer : $answer,answer1 : $answer1,yearsToCompute: $yearsToCompute.")

    var isOk = false
    val message: String
    if (isOk) {
        message = "Success"
    } else {
        message = "Failed"
    }

    println("Message is $message")


    var answer2 = 42
//    answer2 = "no answer"

    val name = if (args.size > 0 ) args[0] else "Kotlin"
    println("Hello,$name!")
}