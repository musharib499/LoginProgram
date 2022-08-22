package com.app.logicprogram

/**
 * Created by Musharib Ali on 3/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println(reversePairNumberSwipe(intArrayOf(1, 2, 3, 1, 4, 5, 2, 3, 6), 4).contentToString())
}

fun reversePairNumberSwipe(array: IntArray, k: Int): IntArray {
    var i = 0
    while (i <= array.size - k) {
        var j = i
        var m = k + i - 1
        if (m >= array.size) return array
        while (j < m) {
            var t = array[j]
            array[j] = array[m]
            array[m] = t
            j++
            m--
        }

        i += k
    }
    return array
}