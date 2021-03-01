package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 1/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    permutation("abc", 0, 2)
}


fun permutation(s: String, l: Int, r: Int) {
    var str = s
    if (l == r) println(str)
    else {
        for (i in l..r) {
            str = swipe(s, l, i)
            permutation(str, l + 1, r)
        }
    }

}

fun swipe(s: String, i: Int, r: Int): String {
    var c = s.toCharArray()
    var t = c[i]
    c[i] = c[r]
    c[r] = t
    return c.concatToString()
}