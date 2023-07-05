package com.app.logicprogram.dataStructure.Stack

import java.util.Stack

fun main() {
  //  println(isValid("()"))
  val list = generateParenthesis(3)
    println(list)
}


fun isValid(s: String): Boolean {

    val stack = Stack<Char>()

    s.forEach { c ->
        if(c == '(' || c == '{'|| c == '[' ) {
            stack.push(c)
        }
        when(c) {
            ')' -> if (stack.peek() == '(')   stack.pop()
            '}' -> if (stack.peek() == '{')   stack.pop()
            ']' -> if (stack.peek() == '[')   stack.pop()

        }
    }
    return stack.isEmpty()

}
fun generateParenthesis(n: Int): List<String> {
    if (n == 0) return emptyList()
    val list = mutableListOf<String>()
    parenthesis(list, "", 0 , n)
    return list

}
fun parenthesis(list:MutableList<String>, parenth:String, start:Int,end:Int) {
    if(end == 0 && start == 0) {
        list.add(parenth)
    }

    if(end > 0)  parenthesis(list, "$parenth(", start+1,end - 1 )
    if (start > 0) parenthesis(list, "$parenth)", start-1, end )

}

