import com.mihk.chapter03.CollectionUtil
import com.mihk.utils.j2s
import com.mihk.utils.lastChar
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

    val util = CollectionUtil()
    println(util.fomatList(collection = nums, start = "(", end = ")", separator = ";"))
    println(util.fomatList(collection = nums, start = " ", end = " ", separator = " "))
    println(util.fomatList(collection = nums, start = " ", end = " ", separator = "."))
    println(util.fomatList(nums))



    println("\"Kotlin\" last char is: ${"Kotlin".lastChar()}")
    println("Kotlin".last())

    println(nums.j2s(start = "("))
    println(nums.j2s(end = " "))
    println(nums.j2s(separator = "."))
    println(nums.j2s(start = " ", end = " "))
    println(nums.j2s(start = " ", separator = "."))
    println(nums.j2s(end = " ", separator = "."))
    println(nums.j2s(start = " ", end = " ", separator = "."))

    val intmap = mapOf<Int, Int>(1 to 10000, 2 to 20000)
    println(intmap.get(1))

    val (number, name) = 1 to "one"
    println("naumber is $number,name is $name.")
    println("123.345.1.234345-A".split("\\.|-".toRegex()))
    println("123.345.1.234345-A".split(".", "-"))
    parsePath("/home/m/Downloads/kotlin.java")
    parsePathWithReg("/home/m/Downloads/kotlin.kt")
    println(mihongkunLogo)
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: ${directory},name: ${fileName},extension: ${extension}")

}


fun parsePathWithReg(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: ${directory},name: ${fileName},extension: ${extension}")
    }

}


val mihongkunLogo ="""
       .___.        .___.        .._..   _        _      _____      __      _     _______     _    __   _        _   __      _  @MT
      ./ _ \.      ./ _ \.       .| |.  | |      | |    /  _  \    |  \    | |   / _____ \   | |  / /  | |      | | |  \    | |
     ./ /.\ \.    ./ /.\ \.      .| |.  | |      | |   /  / \  \   |   \   | |  / /     \_\  | | / /   | |      | | |   \   | |
    ./ /. .\ \.  ./ /. .\ \.     .| |.  | |______| |  |   |  |  |  | |\ \  | |  | |  ______  | |/_/    | |      | | | |\ \  | |
   ./ /.   .\ \../ /.   .\ \.    .| |.  |  ______  |  |   |  |  |  | | \ \ | |  | | |____  | | \ \     | |      | | | | \ \ | |
  ./ /.     .\ \/ /.     .\ \.   .| |.  | |      | |  |   |  |  |  | |  \ \| |  | |      | | | |\ \    \ \      / / | |  \ \| |
 ./ /.       .\  /.       .\ \.  .| |.  | |      | |   \   \_/  /  | |   \   |   \ \_____/ / | | \ \    \ \____/ /  | |   \   |
./_/.         .\/.         .\_\. .|_|.  |_|      |_|    \______/   |_|    \__|    \_______/  |_|  \_\    \______/   |_|    \__|
"""
//infix fun Any.to(other:Any) = Pair(this,other)
