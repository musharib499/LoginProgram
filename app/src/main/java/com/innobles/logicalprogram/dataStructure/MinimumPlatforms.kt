package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 5/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    println(
        findMinPlatform(
            intArrayOf(900, 940, 950, 1100, 1500, 1800),
            intArrayOf(910, 1200, 1120, 1130, 1900, 2000),
            6
        )
    )
}

/*
* Time Complexity: O(nLogn)
* Space Complexity : O(1)
* */
fun findMinPlatform(arriv: IntArray, dep: IntArray, n: Int): Int {
    var min = 0
    var platform = 0

    var j = 0
    var i = 0
    arriv.sort()
    dep.sort()
    while (i < n && j < n) {
        if (arriv[i] <= dep[j]) {
            i++
            platform++
        } else if (arriv[i] > dep[j]) {
            platform--
            j++
        }

        min = if (platform > min) platform else min

    }




    return min
}