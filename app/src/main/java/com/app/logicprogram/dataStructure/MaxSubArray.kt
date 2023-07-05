package com.app.logicprogram.dataStructure

import kotlin.math.max

fun main() {
val sum = maxSubArray1(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))
    println(sum)
}

fun maxSubArray1(nums: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var subSum = 0
    nums.forEach {
        if (subSum < 0) subSum = 0
        subSum +=it
        maxSum = max(subSum, maxSum)
    }
    return maxSum
}
