package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 19/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    println(findMiddle(arrayListOf(4, 10, 5, 7, 6), 0, 4, 3))
}

fun findMiddle(a: ArrayList<Int>, l: Int, r: Int, k: Int): Int {
    var i = 0
    while (i < r) {

        var p = findSmall(a, i, r)
        if (p - 1 == k - 1) return a[p - 1]
        if (p - 1 > k - 1) return findMiddle(a, l, p - 1, k) else findMiddle(a, p + 1, r, k - p)



        i++
    }
    return -1
}


fun findSmall(a: ArrayList<Int>, left: Int, right: Int): Int {
    var l = left
    var r = right
    var x = a[right]
    var i = l
    while (l < r) {
        if (a[l] <= x) {
            var t = a[i]
            a[i] = a[l]
            a[l] = t
            i++
        }
        l++
    }


    var t = a[i]
    a[i] = a[l]
    a[l] = t


    println(a.toString())
    return i
}