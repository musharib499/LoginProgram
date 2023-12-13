package com.app

import java.util.HashMap
import java.util.Stack

val lis = listOf<String?>(
    "Apple",
    "Mango",
    "Bananna",
    "Orange"
)

var listReversedFirstLetter = lis.mapNotNull { it?.reversed() }
fun main() {
    listReversedFirstLetter.apply {
        println(this)
    }
    isValid("()[]{}").apply { println(this) }
    reverseString("GeeksQuiz").apply { println(this) }
}

fun isValid(s: String): Boolean {
    if (s.isEmpty()) return true

    var hashMap = mapOf(
        '}' to '{',
        ']' to '[',
        ')' to '('
    )
    var key = hashMap.keys
    val stack = Stack<Char>()
    s.forEach {
       if (it in key) {
           if (stack.isEmpty() || hashMap[it] != stack.pop()) return false
       }else{
           stack.push(it)
       }

    }

   return stack.isEmpty()

}

fun reverseString(s: String): Unit {
    var stack = Stack<Char>()
    s.forEach{
        stack.push(it)
    }

   var result:String = ""+stack.pop()
   while(!stack.isEmpty()) {
       result += stack.pop()
   }
   println(result)


}