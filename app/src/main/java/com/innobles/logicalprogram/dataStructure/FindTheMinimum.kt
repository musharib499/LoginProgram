package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 12/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    println(findMinValue(intArrayOf(45, 1, 76, 4, 3, 100, 99)))
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




