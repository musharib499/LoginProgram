package com.app.logicprogram

import kotlin.math.min

/**
 * Created by Musharib Ali on 3/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
   // println(jumpMinNumber(intArrayOf(1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9)))
    println(jump(intArrayOf(2,3,1,1,4)))
}
fun jump(nums: IntArray): Int {
    var n = nums.size-1
    var j = 1
    var jump = Int.MAX_VALUE
    while(j<n) {
        if(n%j == 0) {
            jump = min(n/j,jump)
        }
        j++
    }
    return jump
}

fun jumpMinNumber(array: IntArray): Int {
    if (array.size == 0) return -1
    if (array.size <= 1) return 0
    var mr = array[0]
    var s = array[0]
    var jump = 1
    for (i in 1 until array.size) {
        if (i == array.size - 1) {
            return jump
        }
        mr = if (mr > i + array[i]) mr else i + array[i]
        s--
        if (s == 0) {
            jump++
            if (i >= mr) return -1
            s = mr + i
        }
    }

    return -1
}