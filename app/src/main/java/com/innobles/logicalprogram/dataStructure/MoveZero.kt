package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    print(moveZeroes(arrayListOf(1, 2, 3, 0, 2, 3, 4)))
}

fun moveZeroes(nums: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    var k = 0
    var n = nums.size
    while (i < n) {
        if (nums[i] != 0) {
            nums[k++] = nums[i]
        }
        i++
    }
    while (k < n) {
        nums[k++] = 0
    }

    return nums
}


fun checkZero(p: Int, i: Int, n: Int): Int {
    if (i == n) return i
    return if (p != 0) i else checkZero(p, i + 1, n)
}