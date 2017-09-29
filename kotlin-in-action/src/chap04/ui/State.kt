package chap04.ui

import java.io.Serializable

interface State : Serializable {
}

interface View {
    fun getCurrentState(): State
    fun restoreState(): State

}

fun main(args: Array<String>) {
}