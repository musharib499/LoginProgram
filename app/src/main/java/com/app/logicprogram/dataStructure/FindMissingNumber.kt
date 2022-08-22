package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
   // print(findMissingNumber(arrayListOf(1, 2, 3, 4, 6), 6))
    print(getMissingNo(intArrayOf(1, 2, 3, 4, 6), 4))

}

fun findMissingNumber(a: ArrayList<Int>, s: Int): Int {
    var totalSum = (s * (s + 1)) / 2
    var i = 0
    while (i < (s - 1)) {
        totalSum -= a[i]
        i++
    }
    return totalSum
}
fun getMissingNo(a: IntArray, n: Int): Int {
    var total = 1
    for (i in 2..n + 1) {
        total += i
        total -= a[i - 2]
    }
    return total
}

