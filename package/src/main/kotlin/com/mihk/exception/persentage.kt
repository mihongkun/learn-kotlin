package com.mihk.exception

fun main(args: Array<String>) {
    val persentage = 101

    if(persentage !in 0..100) {
        throw IllegalArgumentException("A persentage value must be between 0 an 100,but persentage is : $persentage")
    }
}