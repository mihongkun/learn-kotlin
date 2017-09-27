import com.mihk.enum.Color
import com.mihk.enum.Color.*

fun getMnemonic(color: Color) = when (color) {
    RED -> "Richard"
    ORANGE -> "Of"
    YELLOW -> "York"
    GREEN -> "Gave"
    BLUE -> "Battle"
    INDIGO -> "In"
    VIOLET -> "Vain"
}

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, VIOLET, INDIGO -> "cold"
}

fun mix(color1: Color, color2: Color) = when (setOf(color1, color2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> {
        throw Exception("Dirty color")
    }
}

fun mixOptimized(c1: Color, c2: Color) = when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
    (c1 == YELLOW && c2 == BLUE || c1 == BLUE && c2 == YELLOW) -> GREEN
    (c1 == BLUE && c2 == VIOLET || c1 == VIOLET && c2 == BLUE) -> INDIGO
    else -> throw Exception("Dirty color!")
}

fun main(args: Array<String>) {
    println(RED.r)
    println(RED.g)
    println(RED.b)
    println(RED.rgb())
    println(getMnemonic(VIOLET))
    println(getWarmth(INDIGO))
//    println(mix(VIOLET,INDIGO))
    println(mix(BLUE, VIOLET).rgb())
    println(mixOptimized(BLUE, VIOLET))
}