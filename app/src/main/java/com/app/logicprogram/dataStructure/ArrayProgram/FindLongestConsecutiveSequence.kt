package com.app.logicprogram.dataStructure.ArrayProgram

import java.util.TreeSet

fun main() {
  println(longestConsecutive(intArrayOf(-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7)))
  println(longestConsecutive1(intArrayOf(-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7)))
    checkIfPangram("thequickbrownfoxjumpsoverthelazydog").apply { println(this) }
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

fun longestConsecutive1(nums: IntArray): Int {
    if(nums.isEmpty()) return 0
    if(nums.size == 1) return 1

    nums.sort()
    var count = 1
    var maxCount = Int.MIN_VALUE
    for(i in 0 until nums.size-1) {
        if(nums[i+1] - nums[i] == 1) {
            count++
        } else if (nums[i+1]- nums[i] == 0){
            continue
        } else {
            count = 1
        }
        maxCount = maxOf(maxCount,count)

    }
    return maxOf(maxCount,count)

}

fun checkIfPangram(sentence: String): Boolean {

    val list = mutableListOf<Char>()

    for (i in 'a'..'z') {
        list.add(i.toChar())
    }

    sentence.forEach {
        list.remove(it)
        if(list.isEmpty()) {return true}

    }
    return false

}