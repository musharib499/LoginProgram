package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 11/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    //println(findParenthesisEqualCount("()(()))())"))
    println(findParenthesis("()(()))())"))
}

fun findParenthesisEqualCount(s: String): Int {
    var i = 0
    var open = 0
    var close = 0
    while (i < s.length - 1) {
        if (s[i].equals('(')) {
            open++
        } else if (s[i].equals(')')) {
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