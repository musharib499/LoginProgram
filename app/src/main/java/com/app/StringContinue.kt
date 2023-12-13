package com.app

fun main() {
    getConsecutiveString("aaabbbbccccccca").apply {
        println(this)
    }
}

fun getConsecutiveString(s:String): String {

    var i = 0
    var n= s.length
    var pre:Char = '#'
    var resultString = ""

    var r = 0
    while(i<n) {

        if(pre == '#' || s[i] == pre){
            pre = s[i]
            r++

        } else {

            if(r > 0) {
                resultString += "$pre$r"
            }
            r = 0
            pre = '#'
            i -= r + 1
        }
        i++
    }

    return resultString+"$pre$r"

}


