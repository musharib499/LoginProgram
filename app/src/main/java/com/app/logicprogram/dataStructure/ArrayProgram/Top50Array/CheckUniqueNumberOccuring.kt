package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
    uniqueOccurrences(intArrayOf(3,5,-2,-3,-6,-6)).apply { println(this) }
}

fun uniqueOccurrences(arr: IntArray): Boolean {
    var set = mutableSetOf<Int>()

    arr.forEach {
        if(set.contains(it) && it>0) {
            return true
        }else {
            if (it>0) {
                set.add(it)
            }
        }
    }

    return false

}

