package com.mihk.game

import java.util.*

val binaryReps= TreeMap<Char,String>()

fun main(args: Array<String>) {
    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter,binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf<String>("10","11","1001")
    for ((index,element) in list.withIndex()) {
        println("$index : $element")
    }

}