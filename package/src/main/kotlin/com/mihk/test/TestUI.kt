package com.mihk.test

import com.mihk.ui.Button
import com.mihk.ui.View
import com.mihk.utils.showoff

class TestUI {

}

fun main(args: Array<String>) {
    val view:View = Button()

    view.click()


    if(view is Button) view.showoff()
    view.showoff()

}