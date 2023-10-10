package com.app.logicprogram.kotlindemo.HighOrderFunction

fun main() {
    println(sum(5,10))
}

val sum :(a:Int,b:Int) ->Int = {a,b -> a+b}