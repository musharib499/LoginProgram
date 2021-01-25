package com.innobles.logicalprogram.dataStructure.serching

/**
 * Created by Musharib Ali on 23/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    println(findNumber(intArrayOf(1, 2, 3, 456, 76, 34, 10, 50), 3))
}


fun findNumber(a: IntArray, value: Int): Int {
    var l = 0
    var r = a.size
    while (l < r) {
        var m = (l + r) / 2
        var left = getValue(a, l, m, value)
        var right = getValue(a, m + 1, r, value)
        if (left > -1) return left else l++
        if (right > -1) return right else r--

    }
    return -1
}

fun getValue(a: IntArray, l: Int, r: Int, value: Int): Int {
    if (l >= r) return -1
    if (value == a[l]) return l
    return getValue(a, l + 1, r, value)
}