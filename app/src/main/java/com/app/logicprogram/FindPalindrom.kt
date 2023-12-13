package com.app.logicprogram

fun main() {
val str = "m a 343 la y a l am"
    println(isPalindrome(str))
    println(isPalindrome("ni  t123  5 i 34 n"))
}

fun isPalindrome(s:String) :Boolean {
    var st = ""
    s.forEach {
        if (it in 'a'..'z') {
            st +=it
        }
    }
    return st == st.reversed()
}