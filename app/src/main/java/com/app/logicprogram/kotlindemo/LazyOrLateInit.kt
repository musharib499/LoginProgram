package com.app.logicprogram.kotlindemo

import java.time.temporal.ValueRange

class LazyOrLateInit  {
    lateinit var lateInitString:String
    val lazyValue by lazy { "Hello"
      println("Lazy Initializing")
    }

    fun addValue() {
        if (this::lateInitString.isInitialized){
            println(lateInitString)
        }else {
            println("Value Initializing")
            lateInitString = "Mushareb"
        }
    }
}

fun main() {
    val l = LazyOrLateInit()
    l.addValue()
    l.lateInitString = "Hello"
        l.addValue()
    println(l.lazyValue.toString())
    println(l.lazyValue.toString())

}