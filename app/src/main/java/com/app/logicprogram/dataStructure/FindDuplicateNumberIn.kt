package com.app.logicprogram.dataStructure

import kotlin.math.abs

/**
 * Created by Musharib Ali on 19/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    //getDuplicateNumber(intArrayOf(1, 2, 3, 6, 4, 6, 10, 10))
    //getDuplicateNumberSecond(intArrayOf(1, 2, 3, 6, 8,8,4, 6,3, 1))
    getDuplicateNumberBest(intArrayOf(1, 2, 3, 6, 8, 8, 4, 6, 9, 9))
}

/**
 * First Method
 * Time Complexity: O(n)
 * Auxiliary Space: O(1)
 * */
// only valid only for item small of size
fun getDuplicateNumber(array: IntArray) {
    for (i in 0 until array.size) {
        var j = abs(array[i])
        if (array[j] >= 0) {
            array[j] = -array[j]
        } else {
            println(j)
        }
    }
}

/*
*
    Time Complexity: O(n).
    Only two traversals are needed. So the time complexity is O(n).
    Auxiliary Space: O(1).
    No extra space is needed, so the space complexity is constant.
*/
fun getDuplicateNumberSecond(array: IntArray) {
    for (i in array.indices) {
        println(" ------------Start-----------")
        println(array[i] % array.size)
        println(array[array[i] % array.size] + array.size)
        array[array[i] % array.size] = array[array[i] % array.size] + array.size

        println("-------------End-------------")

    }

    for (i in array.indices) {
        if (array[i] >= array.size * 2) {
            println(i)
        }

    }
}


fun getDuplicateNumberBest(array: IntArray) {
    var n = array.size
    for (i in array.indices) {
        var v = array[i] % n
        if (array[v] >= n && array[v] < n * 2) {

            println(v)
        }

        array[v] += n

    }


}



