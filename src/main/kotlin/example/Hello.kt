package example

import javafx.geometry.Pos
import tornadofx.*

class HelloWorld : View() {
    override val root = hbox {
        button("Alert").setOnAction { _ ->
            information("header text", "content text")
        }
    }
}

class HelloWorldStyle : Stylesheet() {
    init {
        root {
            prefWidth = 400.px
            prefHeight = 400.px
            alignment = Pos.CENTER
        }
    }
}

class HelloWorldApp : App(HelloWorld::class, HelloWorldStyle::class)

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}