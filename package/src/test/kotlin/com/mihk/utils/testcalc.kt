package com.mihk.utils

import com.mihk.calc.Num
import com.mihk.interfaces.Expr
import com.mihk.sum.Sum


fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval(e: Expr): Int {
    if (e is Num) {
//        val n = e as Num
        return e.value

    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalAccessException("Unknown expression!")
}

fun evalWhen(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> evalWhen(e.right) + eval(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}

fun evalLogging(e: Expr): Int = when (e) {
    is Num -> {
        println("num : ${e.value}")
        e.value
    }
    is Sum -> {
        val left = evalLogging(e.left)
        val right = evalLogging(e.right)
        println("sum : ${left} + ${right} = ${left + right}")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown expression")
}