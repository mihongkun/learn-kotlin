package chap04.Interfaces

interface Focusable {
    fun setFocus(isFocused: Boolean) = println("I ${if(isFocused) "got" else "lost" } focus")
    fun showoff() = println("I am Focusable showoff")
}