package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 13/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    //println(checkPalindrome("mushu123,}{]-= hsum"))
   // println(checkPalindrome2("NITIN"))
    println(isPalindrome("A man, a plan, a canal: Panama"))
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


fun checkPalindrome2(s: String): Boolean {
    var i = 0

    while (i < (s.length / 2)) {
        if (s[i] != s[s.length - 1 - i]) return false
        i++
    }


    return true
}


fun isPalindrome(s: String): Boolean {
    var t = ""

    s.forEach {
        if(it in 'a'..'z') {
            t+=it
        }
        if(it in 'A'..'Z') {
            t+= it + 32
        }
    }
    return t == t.reversed()

}



