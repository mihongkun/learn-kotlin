@file:JvmName("Util")

package com.mihk.utils

import com.mihk.ui.Button
import com.mihk.ui.View

@JvmOverloads
fun <T> join2String(collection: Collection<T> = listOf<T>(), start: String = "\"", end: String = "\"", separator: String = "$"): String? {
    val result = StringBuilder().append(start)
    for (c in collection) if (c != collection.last()) result.append(c).append(separator) else result.append(c)
    return result.append(end).toString()
}

fun String.lastChar(): Char = get(length - 1)


@JvmOverloads
fun <T> Collection<T>.j2s(start: String = "`", end: String = "`", separator: String = "%"): String {
    val result = StringBuilder().append(start)
    for (c in this) {
        if (c != last()) result.append(c).append(separator) else result.append(c)
    }
    return result.append(end).toString()
}


fun View.showoff() = println("I am View!")
fun Button.showoff() = println("I am Button!")

val String.last: Char
    get() = get(length - 1)

var StringBuffer.last: Char
    get() = get(length - 1)
    set(value: Char) = setCharAt(length - 1, value)