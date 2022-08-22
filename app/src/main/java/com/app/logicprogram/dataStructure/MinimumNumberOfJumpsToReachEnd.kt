package com.app.logicprogram

/**
 * Created by Musharib Ali on 3/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println(jumpMinNumber(intArrayOf(1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9)))
}

fun jumpMinNumber(array: IntArray): Int {
    if (array.size == 0) return -1
    if (array.size <= 1) return 0
    var mr = array[0]
    var s = array[0]
    var jump = 1
    println(array[0])
    for (i in 1 until array.size) {
        if (i == array.size - 1) {
            println(array[i])
            return jump
        }
        mr = if (mr > i + array[i]) mr else i + array[i]
        s--
        if (s == 0) {
            jump++
            println(array[i])
            if (i >= mr) return -1
            s = mr + i
        }
    }

    return -1
}