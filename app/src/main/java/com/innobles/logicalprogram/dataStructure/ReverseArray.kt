package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    print(reverseArray(arrayListOf(1, 2, 3, 4, 5, 6, 7, 8)))
}

fun reverseArray(a: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    val n = a.size - 1
    while (i <= n / 2) {
        a[i] = a[i] + a[n - i]
        a[n - i] = a[i] - a[n - i]
        a[i] = a[i] - a[n - i]
        i++
    }

    return a
}