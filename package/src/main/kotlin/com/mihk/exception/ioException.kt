package com.mihk.exception

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader:BufferedReader) :Int?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e: NumberFormatException) {
        throw e
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {

    println(readNumber(BufferedReader(StringReader("yyy"))))
}