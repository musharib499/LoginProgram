package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 13/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    println(checkPalindrome("mushu123,}{]-= hsum"))
}

fun checkPalindrome(s: String): Boolean {
    var i = 0
    var j = s.length - 1
    var first = ""
    var second = ""
    while (i < s.length) {

        if (s[i] in 'a'..'z') {
            first += s[i]
        }
        if (s[s.length - i - 1] in 'a'..'z') {
            second += s[s.length - i - 1]
        }
        i++

        // i++

    }

    return second.equals(first)
}


