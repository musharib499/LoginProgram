package com.app.logicprogram.oops

fun main() {
    val p : Parent = Child()
    p.code()
}


open class Parent {
    companion object {
        fun a() : Int = 1
    }
    open fun code() {
        println("A")
    }


}

class Child : Parent() {
     override fun code() {
        println("B")
    }


}
