package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
//print(largeAndSmallest(arrayListOf(1,2,30,20,5,3)))
    print(largeAndSmallest(arrayListOf(20, 34, 21, -87, 92)))
}

fun largeAndSmallest(a: ArrayList<Int>): String {
    var i = 0
    var small = -1
    var large = -1

    while (i < a.size) {
        if (i == 0) {
            small = a[i]
            large = a[i]
        }
        if (small > a[i]) small = a[i]

        if (large < a[i]) large = a[i]

        i++
    }
    return "Small value $small , Large value $large"
}