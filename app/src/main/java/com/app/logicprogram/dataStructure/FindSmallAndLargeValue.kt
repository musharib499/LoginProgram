package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
//print(largeAndSmallest(arrayListOf(1,2,30,20,5,3)))
    println(largeAndSmallest(arrayListOf(20, 34, 21, -87, 92)))
    println(smallLarge(arrayListOf(20, 34, 21, -87, 92)))
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

fun smallLarge(a: ArrayList<Int>): String {

    var s = Int.MAX_VALUE
    var f = Int.MIN_VALUE
    var i = 0
    while (i < a.size) {
        if (f < a[i]) f = a[i]
        if (s > a[i]) s = a[i]
        i++
    }

    return "small $s  and large $f"
}
