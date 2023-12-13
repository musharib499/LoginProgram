package com.app.logicprogram.dataStructure

import kotlin.math.min

/**
 * Created by Musharib Ali on 12/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println(findMinValue(intArrayOf(45, 1, 76, 4, 3, 100, 99)))
    println(findAnotherWayMinValue(intArrayOf(45, 1, 76, 4, 3, 100, 99)))
}

fun findMinValue(a: IntArray): Int {
    var i = 0
    var j = a.size - 1
    while (i < j) {
        var mid: Int = i + (j - i) / 2
        //  if (a[mid]==a[j]) j--

        if (a[mid] < a[j]) j = mid else i = mid + 1


    }
    return a[i]

}

fun findAnotherWayMinValue(a: IntArray): Int {
    var j = a.size
    var minValue = Int.MAX_VALUE
    for (i in 0..j/2) {
        val m = min(a[i],a[j-i-1])
        minValue = min(minValue,m)
    }
    return minValue

}




