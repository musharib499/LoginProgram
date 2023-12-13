package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
    findPeekElement(intArrayOf(100, 80, 60, 50, 20)).apply {
        println(this)
    }
}

fun findPeekElement(nums: IntArray):Int {

    var maxValue = maxOf(nums[0],nums[nums.size-1])
    for (i in 1 until nums.size-1) {
        if (nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
            maxValue = Math.max(maxValue, nums[i])
        }
    }

    return maxValue
}
