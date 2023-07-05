package com.app.logicprogram.dataStructure.Stack

import java.lang.Character.isLetterOrDigit
import java.util.Stack

fun main() {
    val input = "a+b*(c^d-e)^(f+g*h)-i"

    val output = convertInfixToP(input)
    println(output)

}

fun convertInfixToP(input: String): String {
    val stack = Stack<Char>()
    var value = ""

    input.forEach {

        when {
            it.isLetterOrDigit() -> {
                value += it
            }

            it == '(' -> {
                stack.push(it)
            }

            it == ')' -> {
                while (stack.isNotEmpty() && stack.peek() != '(') {
                    value += stack.peek()
                    stack.pop()
                }
                stack.pop()
            }

            else -> {
                while (stack.isNotEmpty() && procedence(it) <= procedence(stack.peek())) {
                    value += stack.peek()
                    stack.pop()

                }
                stack.push(it)
            }
        }


    }

    while (stack.isNotEmpty()) {
        if (stack.peek() == '(') return "Invalid Expression"

        value += stack.peek()
        stack.pop()

    }
    return value

}

fun procedence(c: Char): Int {
    return when (c) {
        '+' -> 1
        '-' -> 1
        '*' -> 2
        '/' -> 2
        '^' -> 3
        else -> -1

    }

}

