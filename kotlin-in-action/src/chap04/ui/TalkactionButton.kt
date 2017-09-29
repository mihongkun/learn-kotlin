package chap04.ui

import chap04.Interfaces.Focusable

internal open class TalkactionButton:Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper()= println("Let us talk!")
}

//fun TalkactionButton.giveSpeech() {
//    yell()
//    whisper()
//}