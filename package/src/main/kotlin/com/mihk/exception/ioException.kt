package com.mihk.exception

import java.io.BufferedReader

fun readNumber(reader:BufferedReader) :Int?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e: NumberFormatException) {
        e.stackTrace
        return null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    
}