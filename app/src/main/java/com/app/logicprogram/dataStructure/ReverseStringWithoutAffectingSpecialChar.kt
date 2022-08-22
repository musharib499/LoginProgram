package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 11/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    println(reverseString("a!!!b.c.d,e'f,ghi".toCharArray()))
}

fun reverseString(s: CharArray): CharArray {
    var l = 0
    var r = s.size - 1
    while (l < r) {
        var lv: Char? = null
        var rv: Char? = null
        if (s[l] in 'a'..'z') {
            lv = s[l]
        }
        if (s[r] in 'a'..'z') {
            rv = s[r]
        }
        if (lv != null && rv != null) {
            s[l] = rv
            s[r] = lv
            l++
            r--

        }
        if (lv == null) {
            l++
        }
        if (rv == null) {
            r--
        }

    }
    return s
}