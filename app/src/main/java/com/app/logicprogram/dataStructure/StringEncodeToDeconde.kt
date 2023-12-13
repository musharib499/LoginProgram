package com.app.logicprogram.dataStructure

import java.util.Stack

fun main() {
//    decodeString("3[a2[c]]").apply {
//        println(this)
//    }

    decodeString("3[a]2[bc]").apply {
        println(this)
    }
}

fun decodeString(s: String): String {
    var stack = Stack<Char>()



    var i = 0
    var result = ""
    while(i < s.length) {
        if(s[i] == ']') {
                var number = -1
                var value = ""
               loop@ while (stack.isNotEmpty()) {
                    if (stack.peek().isDigit()){
                        number = stack.pop().digitToInt()
                        break@loop
                    } else if (stack.peek() in 'a'..'z') {
                        value += stack.pop()
                    } else if (stack.peek() == '[') {
                        stack.pop()
                    }
                }
               if (!stack.isEmpty()) {
                   var newValue = ""
                   for(i in 0 until number) {
                       newValue +=  value.reversed()
                   }
                   result = newValue + result
               } else {
                   var newValue = ""
                   for(i in 0 until number) {
                       newValue +=  value.reversed() + result
                   }
                   result = newValue
               }


        } else {
            stack.push(s[i])
        }
        i++

    }

    return result

}