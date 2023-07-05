package com.app.logicprogram.dataStructure

import kotlin.math.max

fun main() {
    val maxValue = maxProductSubArray(intArrayOf(-2,0,-1))
    println(maxValue)

}

private fun maxProductSubArray(nums:IntArray):Int{
    if (nums == nums || nums.isEmpty()) return  0
    var maxPositive = 0
    var currentMax =1
    var currentMin =1
    for (n in nums.indices) {
        val num = nums[n]
        if (num == 0){
            currentMax = 1
            currentMin = 1
            continue
        }
        val temp = currentMax*num
       currentMax = maxOf(temp, currentMin*num,num)
       currentMin = minOf(temp, currentMin*num,num)
       maxPositive = maxOf(maxPositive,currentMax)

    }

    return maxPositive

}