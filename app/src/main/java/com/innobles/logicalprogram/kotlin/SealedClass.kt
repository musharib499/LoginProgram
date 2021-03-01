package com.innobles.logicalprogram.kotlin

/**
 * Created by Musharib Ali on 25/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    ///var s = SealedClass.A().display()
    SealedClass.A().display()
    println("hello".contains("Bye", false))
}

fun String.contains(other: CharSequence, ignoreBoolean: Boolean): String {
    return this + " " + other
}

sealed class SealedClass {
    open fun display() {
        println("AA")
    }

    class A : SealedClass() {

        override fun display() {
            super.display()
            println("A")
        }
    }
}