package com.app.logicprogram.kotlindemo.functionInterface

fun main() {
    val result = FunctionInterface { a, b, op ->
        return@FunctionInterface when (op) {
            '+' -> a + b
            '*' -> a * b
            '/' -> a / b
            else -> a % b
        }
    }

    println(result.add(10, 20, '+'))
    println(result.add(10, 20, '*'))
    println(result.add(10, 20, '/'))
    println(result.multiple(10, 20))

    println(isEven(10,7))


}

typealias IntPredicate = (i: Int, j:Int) -> Boolean

val isEven: IntPredicate = { a,b -> ((a+b)% 2) == 0 }

fun interface FunctionInterface {
    fun add(a: Int, b: Int, op: Char): Int
    fun multiple(a: Int, b: Int): Int {
        return a * b
    }
}
 interface NewInterface