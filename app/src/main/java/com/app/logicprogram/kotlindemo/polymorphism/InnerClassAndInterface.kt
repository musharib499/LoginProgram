package com.app.logicprogram.kotlindemo.polymorphism

fun main() {
    // With out mark inner class // can not access outer class member inside nested class
    val demo = Outer.Nested().foo() // == 2
    val demo1 = Outer().Nested1().foo() // == 1
    println("Nested with inner can not access outer class member $demo ")
    println("Nested with inner can  access outer class member $demo1 ")




}


class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
        // bar can not access
    }

    // if i mark as  inner then can access outer member like below

    inner class Nested1 {
        fun foo() = bar
    }
}


fun printLine() { println("Top-level function") }

class A {
    fun printLine() { println("Member function") }

    fun invokePrintLine(omitThis: Boolean = false)  {
        if (omitThis) printLine()
        else this.printLine()
    }
}

