package chap02

class Rectangle(val height:Int,val width:Int) {
    val isSquare:Boolean
        get() = height == width

    override fun toString(): String {
        return "Rectangle(height=$height, width=$width)"
    }

}

fun main(args:Array<String>) {
    val height = 43
    val width = 43
    val retangle = Rectangle(height,width)
    println("The Rectangle width id ${height},height is ${height}.is square?  ${retangle.isSquare}.")
    println("The object is ${retangle}")
    println(retangle)
}