package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 15/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    findTriplets()
}

fun findTriplets() {
    val a = arrayListOf<Int>(1, 2, 3, 4, 5)
    val b = arrayListOf<Int>(6, 7, 8, 9, 10)
    val c = arrayListOf<Int>(11, 12, 13, 14, 15)
    val sum = 20

    var i = 0
    val hashMap = HashMap<Int, String>()
    while (i < a.size) {
        var j = 0
        while (j < b.size) {
            hashMap.put(a[i] + b[j], "${a[i]},${b[j]}")
            j++
        }
        i++
    }
    var k = 0
    while (k < c.size) {
        if (hashMap.containsKey(sum - c[k])) {
            println("(${hashMap.get(sum - c[k])},${c[k]})")
        } else {
            hashMap.put(sum - c[k], "${c[k]}")
        }
        k++
    }


}