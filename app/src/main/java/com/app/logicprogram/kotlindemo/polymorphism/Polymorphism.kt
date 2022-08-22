package com.app.logicprogram.kotlindemo.polymorphism

/**
 * Created by Musharib Ali on 7/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
open class AA {
    open fun add() {
        print("Hello")
    }

    open fun add(a: Int) {
        print(a)
    }

    fun add(a: Int, b: Int) {
        print(a + b)
    }

    open fun printValue(a: Int, b: Int): Int {
        return a + b
    }

    open fun printValue(a: Int): Int {
        return a
    }
}

class BB : AA() {
    override fun add() {
        super.add()  // call for print super value
        print("Bye")

    }

    override fun add(a: Int) {
        print("second")
    }

    override fun printValue(a: Int, b: Int): Int {
        val a = a * 2
        return super.printValue(a, b)
    }

}

fun main() {
    BB().let {
        it.add()
        it.add(5)
        print(it.printValue(2, 4))
    }
}

