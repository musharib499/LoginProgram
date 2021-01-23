package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 15/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    commonSmallestSubSting("bd", "abcd")
}

fun commonSmallestSubSting(f: String, s: String): Int {
    var small = ""
    var large = ""
    small = if (s.length > f.length) f else s
    large = if (s.length > f.length) s else f

    var i = 0
    var h = HashMap<String, Int>()
    while (i < large.length) {
        var j = 0
        while (i < large.length - 1) {
            if (small.contains(large.substring(i, j))) {
                if (h.containsKey(large.substring(i, j))) {
                    h.put(large.substring(i, j), h.get(large.substring(i, j))?.plus(1) ?: 1)
                } else h.put(large.substring(i, j), 1)
            }
            j = j + i + 1
        }
        i++

    }
    println(h.toString())

    return -1
}
