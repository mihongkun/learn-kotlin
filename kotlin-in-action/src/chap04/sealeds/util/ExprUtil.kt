package chap04.sealeds.util

import chap04.sealeds.Expr

fun eval(e: Expr): Int = when (e) {
    is Expr.Num -> {
        println("The number is: {$e}")
        e.value
    }
    is Expr.Sum -> {
        println("The summery left is:{ ${e.left}},right is:{ ${e.right}}")
        eval(e.left) + eval(e.right)
    }
}