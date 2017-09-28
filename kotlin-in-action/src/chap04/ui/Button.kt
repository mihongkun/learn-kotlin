package chap04.ui

import chap04.Interfaces.Clickable
import chap04.Interfaces.Focusable

class Button : Clickable, Focusable {
    override fun click() =
            println("Button is clicked!")


    override fun showoff() =
//        super<Clickable>.showoff()
//        super<Focusable>.showoff()
            println("Button showoff()")


}

fun main(args: Array<String>) {
    val button = Button()
    button.showoff()
    button.click()
    button.setFocus(true)

}