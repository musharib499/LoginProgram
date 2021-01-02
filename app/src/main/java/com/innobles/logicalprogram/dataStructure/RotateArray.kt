package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    print(rotate(intArrayOf(1, 2, 3, 4, 5, 6), 3).contentToString())
}

fun rotate(nums: IntArray, k: Int): IntArray {
    var q = k
    var n = nums.size - 1
    // q is grater than n cover this case modules
    if (q > n) q = q % (n + 1)

    var num = nums
    num = reverse(num, 0, n)
    num = reverse(num, 0, q - 1)
    num = reverse(num, q, n)


    return num
}

fun reverse(nums: IntArray, start: Int, end: Int): IntArray {
    var p = start
    var k = end
    while (p < k) {
        var temp = nums[p]
        nums[p] = nums[k]
        nums[k] = temp
        p++
        k--
    }
    return nums
}