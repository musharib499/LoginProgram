package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 02/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */


fun main() {
    println(longestWord("Hello Hh ppp"))
}

fun longestWord(sen: String): String {

    // code goes here

    var i = 0
    var k = 0
    var last = 0
    var s = ""
    var l = ""

    while (i < sen.length) {
        if (sen[i] != ' ') {
            s += sen[i]
            k++

        } else {
            if (k > last) {
                last = k
                l = s
                s = ""
            }
            k = 0
        }
        i++
    }

    return l

}

