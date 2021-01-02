package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
//How do you find duplicate numbers in an array if it contains multiple duplicates? (solution)
fun main() {
    println(findDuplicateNumber(arrayListOf(1, 2, 4, 4, 5)))
    println(findMultipleDuplicateNumber(arrayListOf(1, 2, 4, 4, 5, 7, 8, 9, 8)))

    println(removeDuplicateNumber(arrayListOf(1, 2, 4, 4, 5, 7, 8, 9, 8)))
}

// For single duplicate number
fun findDuplicateNumber(a: ArrayList<Int>): Int {
    var n = a.size - 1
    var i = 0
    val h = HashMap<Int, Int>()
    while (i < n) {
        if (!h.containsKey(a[i])) {
            h.put(a[i], 1)
        } else {
            return a[i]
        }
        i++
    }
    return -1
}


fun findMultipleDuplicateNumber(a: ArrayList<Int>): String {
    var i = 0
    val h = HashMap<Int, Int>()
    var value = ""
    while (i < a.size) {
        if (!h.containsKey(a[i])) h.put(a[i], 1) else value += "${a[i]},"

        i++
    }
    return value
}

//How are duplicates removed from a given array in Java? (solution)

fun removeDuplicateNumber(a: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    val h = HashMap<Int, Int>()
    while (i < a.size) {
        if (!h.containsKey(a[i])) h.put(a[i], 1) else a.remove(a[i])

        i++
    }
    return a
}


