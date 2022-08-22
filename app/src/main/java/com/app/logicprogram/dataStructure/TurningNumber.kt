package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 1/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println(getTurningNumber(arrayListOf(1, 2, 3, 4, 5, 10, 9, 8, 7, 6), 0, 10))
}

// complexcity O(Logn)
fun getTurningNumber(a: ArrayList<Int>, l: Int, r: Int): Int {
    if (l == r) return a[l]
    if ((r == l + 1) && a[l] >= a[r]) return a[l]
    if ((r == l + 1) && a[l] < a[r]) return a[r]
    var m = (l + r) / 2

    if (a[m] > a[m + 1] && a[m] > a[m - 1]) return a[m - 1]

    if (a[m] > a[m + 1] && a[m] < a[m - 1]) return getTurningNumber(a, l, m - 1)

    return getTurningNumber(a, m + 1, r)
}