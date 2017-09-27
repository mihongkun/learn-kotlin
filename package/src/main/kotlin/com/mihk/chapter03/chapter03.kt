import java.util.*

fun main(args: Array<String>) {
    val list = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (l in list) {
        print("$l ")
    }
    println()
    val set = hashSetOf<Int>(1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 1, 0, 0, 0, 0, 0)
    print("$set ")
    println()
    println(set.javaClass)
    println(list.javaClass)

    val strings = listOf("1", "2", "last")
    println(strings.last())

    val map = mapOf(Pair(1, 3))
    println(map.get(1))
    println(map.javaClass)


    val hp = hashMapOf<String, String>(Pair("1", "first"), Pair("", ""))
    println(hp[""] + "null")
    println(hp.javaClass)
    println(list.max())

    val ll = LinkedList<Int>()
    ll.add(1)
    println(ll.javaClass)

    val nums = listOf(1, 2, 3, 4, 6, 123, 12, 1, 12, 23, 1, 2, 3, 4, 5, 6)
    println(nums)

    fun <T>fomatList(collection:Collection<T>,start:String,end:String,separator:String):String {
        val result = StringBuilder().append(start)
        for (c in collection) if (c != collection.last()) result.append(c).append(separator) else result.append(c)
        return result.append(end).toString()
    }
    println(fomatList(nums,"(",")",";"))

}