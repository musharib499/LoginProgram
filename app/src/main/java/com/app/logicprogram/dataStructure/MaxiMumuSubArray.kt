package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 28/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {

    print(maxSubArray(intArrayOf(5, 5, 10, 100, 10, 5)))
    print(getMaxSumOfNonAdjacentElements(intArrayOf(5, 5, 10, 100, 10, 5)))

}

fun maxSubArray(nums: IntArray): Int {
    var n = nums.size
    if (n == 0) return 0
    if (n == 1) return  nums[0]
    var maxSumOf = IntArray(n)
     maxSumOf[0] = nums[0]
     maxSumOf[1] = maxOf(nums[0],nums[1])
     for (i in 2 until n) {
         maxSumOf[i] = maxOf(maxSumOf[i-2] + nums[i],maxSumOf[i-1])
     }

    return maxSumOf[n-1]
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