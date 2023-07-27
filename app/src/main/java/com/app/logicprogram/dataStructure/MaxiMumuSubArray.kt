package com.app.logicprogram.dataStructure

import kotlin.math.max

/**
 * Created by Musharib Ali on 28/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {

   // println(maxSubArray(intArrayOf(5, 5, 10, 100, 10, 5)))
 //   println(getMaxSumOfNonAdjacentElements(intArrayOf(5, 5, 10, 100, 10, 5)))
   // println(maxProduct(intArrayOf(0,2)))
    println(miniMaxSum(arrayOf(140537896, 243908675, 670291834, 923018467, 520718469)))

}
fun maxProduct(nums: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var subPro = 1
    nums.forEach {
        if(it == 0) subPro = 1
        subPro *= it
        maxSum = maxOf(subPro,maxSum)
    }
    return maxSum

}

// 100% case success
fun maxSubArray(nums: IntArray): Int {
    var maxSum = Int.MIN_VALUE
    var subSum = 0
    nums.forEach {
        if (subSum < 0) subSum = 0
        subSum +=it
        maxSum = max(subSum, maxSum)
    }
    return maxSum
}

// or

fun getMaxSumOfNonAdjacentElements(arr: IntArray): Int {
    var element = arr[0]
    var excl = 0
    for (i in 1 until arr.size) {
        val temp = element
        element = maxOf(arr[i] + excl, element)
        excl = temp
    }
    return maxOf(element, excl)
}


fun miniMaxSum(arr: Array<Int>): Unit {
    var max:Long = 0
    var min:Long = 0
    arr.sort()

    var k = 0

    while(k<4 && k<arr.size) {
        min += arr[k]
        max += arr[arr.size-k-1]
        k++
    }

    println("$min $max")

}
