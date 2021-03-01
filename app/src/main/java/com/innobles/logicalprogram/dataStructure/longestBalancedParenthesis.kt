package com.innobles.logicalprogram.dataStructure

import java.util.*

/**
 * Created by Musharib Ali on 11/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    //println(findParenthesisEqualCount("()(()))())"))
    // println(findParenthesisEqualCount("{]{}"))
    //  println(findParenthesis("()(()))())"))
    println(findLongestBalanceParenthesis("()(()))())"))
    println(findLongestBalanceParenthesis("{]{}"))
    println(findLongestBalanceParenthesis("}{"))
    println(findLongestBalanceParenthesis("}{"))
    println(findLongestBalanceParenthesis("{}}}"))
}

fun findParenthesisEqualCount(s: String): Int {
    var i = 0
    var open = 1
    var close = 1
    while (i < s.length - 1) {
        if (s[i].equals('(') || s[i].equals('{') || s[i].equals('[')) {
            open++
        } else if (s[i].equals('}') || s[i].equals(')') || s[i].equals(']')) {
            close++

        }

        i++
    }
    return if (open > close) close else open
}


fun findParenthesis(s: String): String {
    var i = 0
    var p = ""
    var q = ""
    var k = 0
    while (i < s.length) {
        if (s[i].equals('(')) {
            k++
            if (k > 0) q += s[i]
        } else if (s[i].equals(')')) {
            if (k > 0) {
                q += s[i]

            } else k = 1
            k--


        }
        if (k == 0) {
            p += q
            q = ""
        }
        i++
    }
    return p
}

fun findLongestBalanceParenthesis(s: String): Int {

    var stack = Stack<Int>()
    stack.push(-1)
    var i = 0
    var max = 0
    while (i < s.length) {
        if (s[i].equals('{') || s[i].equals('('))
            stack.push(i)
        else {

            if (!stack.empty()) stack.pop()

            if (!stack.empty()) {
                max = Math.max(max, i - stack.peek())
            } else {
                stack.push(i)
            }


        }


        i++
    }

    return max
}



