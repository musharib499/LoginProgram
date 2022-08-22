package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 15/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    println(minDist(intArrayOf(3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3), 3, 6))
}


// with two loop complicity will be O(n)
fun minDist(arr: IntArray, x: Int, y: Int): Int {
    var n = arr.size
    var minDist = Int.MAX_VALUE
    var f = -1

    var i = 0
    while (i < n) {
        if (arr[i] == x || y == arr[i]) {
            if (f != -1 && arr[i] != arr[f]) {
                minDist = Math.min(minDist, i - f)
            }
            f = i

        }
        i++
    }
    if (minDist == Int.MAX_VALUE) return -1
    return minDist

}