package com.mihk.test

import com.mihk.utils.last

class TestAttributeX {
}

fun main(args: Array<String>) {
    println("mihonglun".last)
    val x = StringBuffer().append("xyyyy").append("yxxxx8")
    println(x.last)
    x.last = 'x'
    println(x.last)

}