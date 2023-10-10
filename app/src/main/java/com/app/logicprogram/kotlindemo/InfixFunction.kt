package com.app.logicprogram.kotlindemo

fun main() {
    println(1 plus  3)
    println(2 multiple   3)
    println("Hello" plus  "Mushareb" plus "Ali")
    println(listOf<Any>("Hello") plusItem   "Bye")

}

infix fun Int.plus(x: Int): Int { return this + x }

infix fun Int.multiple(x: Int): Int { return this * x }
infix fun Long.multiple(x: Long): Long { return this * x }
infix fun String.plus(x: String): String { return this + x }
infix fun List<Any>.plusItem(x:Any):List<Any> {
    return this.plus(x)
}







