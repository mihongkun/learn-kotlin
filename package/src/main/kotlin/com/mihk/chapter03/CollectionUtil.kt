package com.mihk.chapter03

class CollectionUtil {

    @JvmOverloads
    fun <T> fomatList(collection: Collection<T>, start: String = "(", end: String = ")", separator: String = ","): String {
        val result = StringBuilder().append(start)
        for (c in collection) if (c != collection.last()) result.append(c).append(separator) else result.append(c)
        return result.append(end).toString()
    }
}