package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 8/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    println(getArrangeArray(intArrayOf(1, 2, 3, 4, 5, 6)).contentToString())
}

fun getArrangeArray(arr: IntArray): IntArray {


    var n = arr.size
    var i = 0
    var d = arr[1] - arr[0]
    var v = 1

    while (i < n) {
        arr[i] = d * (n - v + 1)
        arr[i + 1] = d * v
        v++
        i += 2
    }


    return arr

}