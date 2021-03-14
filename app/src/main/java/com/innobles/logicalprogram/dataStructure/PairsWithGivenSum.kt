package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 14/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    println(getPairSum(intArrayOf(1, 4, 3, 1), 2))
    println(getPairSum(intArrayOf(1, 2, 3, 9, 1, 2, 3), 14))
    println(getPairSum(intArrayOf(1, 2, 3, 9, 1, 2, 3), 4))
}

fun getPairSum(ar: IntArray, sum: Int): Boolean {

    var i = 0
    var h = HashMap<Int, Int>()
    while (i < ar.size) {
        var s = sum - ar[i]

        if (h.containsKey(s)) {
            return true
        } else {
            h.put(ar[i], 1)
        }

        i++
    }
    return false
}