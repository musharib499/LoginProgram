package com.app.logicprogram.dataStructure.ArrayProgram

import java.util.TreeSet

fun main() {
  println(longestConsecutive(intArrayOf(-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7)))
}

fun longestConsecutive(nums: IntArray): Int {
    if(nums.isEmpty()) return 0
    if(nums.size == 1) return 1

    val hashTree = TreeSet<Int>()

    nums.forEach {
        hashTree.add(it)
    }
    var count = 0
    var max = 0
    var previous = hashTree.pollFirst()
    for(value in hashTree) {
        val newValue = if (previous>value) value - previous else previous-value
        if(Math.abs(newValue) == 1) {
            previous = value
            count++
        }else {
            max = maxOf(count,max)
            count = 0
            previous = value
        }

    }
    max = maxOf(count,max)
    return max+1
}