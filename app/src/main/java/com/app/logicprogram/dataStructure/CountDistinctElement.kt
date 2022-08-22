package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 12/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    println(findCountDistinctElement(arrayListOf(1, 2, 1, 3, 4, 2, 3), 4))
}


fun findCountDistinctElement(array: ArrayList<Int>, k: Int): String {
    var i = 0
    var result = ""
    while (i <= array.size - k) {
        var j = i
        var s: Set<Int> = setOf<Int>()
        var r = 0
        while (j < array.size && j < (k + i)) {
            if (!s.contains(array[j])) {
                s += array[j]
                r += 1
            }
            j++
        }
        result += r.toLong()
        if (j >= array.size) break
        i++

    }
    return result

}






