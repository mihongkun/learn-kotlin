package chap04.sealeds

import chap04.sealeds.util.eval

class Calc {
}

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}