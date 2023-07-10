package com.app.logicprogram.dataStructure

import kotlin.math.max

fun main() {
    //val maxValue = maxProductSubArray(intArrayOf(-2,0,-1))
  //  println(maxValue)
    println(maximumProduct(intArrayOf(-1,-2,-3,-4)))

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

fun maximumProduct(nums: IntArray): Int {
    if(nums.size<3) return -1
    if(nums.size == 3) return nums[0]*nums[1]*nums[2]

    var sorted = nums.sorted()
    var first = sorted[sorted.size-1]*sorted[sorted.size-2]*sorted[sorted.size-3]
    var second = sorted[0]*sorted[1]*sorted[sorted.size-1]
    return if(first>second) first else second
}
