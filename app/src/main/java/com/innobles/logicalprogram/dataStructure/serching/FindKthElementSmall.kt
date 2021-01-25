package com.innobles.logicalprogram.dataStructure.serching

/**
 * Created by Musharib Ali on 23/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    kthElement(intArrayOf(8, 10, 11, 2, 3, 6, 20, 100, 1, 5, 50, 9), 8)
}

fun kthElement(a: IntArray, k: Int) {
    var i = 0
    var n = a.size - 1
    while (i < k) {
        val m = (n - i) / 2 + i
        val left = getValueFind(a, i, m, i)
        println(a[left])
        val right = getValueFind(a, m + 1, n, m + 1)
        println(a[right])
        var p = if (a[left] < a[right]) left else right

        a[i] = a[i] + a[p]
        a[p] = a[i] - a[p]
        a[i] = a[i] - a[p]





        println(a[i])
        println()
        i++

    }
    println("final value")
    println(a[i - 1])
    println(a.contentToString())
}

fun getValueFind(a: IntArray, left: Int, right: Int, s: Int): Int {
    var value = s
    if (left > right) return value

    if (a[value] > a[left]) value = left

    return getValueFind(a, left + 1, right, value)


}