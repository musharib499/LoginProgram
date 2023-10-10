package com.app.logicprogram.kotlindemo

fun main() {
    val sum = add(10,20)
    println(sum)
}

inline fun add(a:Int,b:Int) :Int {
    return a+b
}