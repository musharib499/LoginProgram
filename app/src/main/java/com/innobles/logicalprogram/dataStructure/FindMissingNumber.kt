package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    print(findMissingNumber(arrayListOf(1, 2, 3, 4, 6), 6))

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

