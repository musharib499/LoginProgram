package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 06/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
  println(longestIncSequence(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)))
}

fun longestIncSequence(nums:IntArray):Int{
    if (nums.isEmpty()) return 0

    if (nums.size == 1) return 1

    var n = nums.size
    var aa = mutableListOf<Int>()
    var i = 0
    var k = 0
    var s = Int.MAX_VALUE
    while (i < n - 1) {


        if (nums[i] < nums[i + 1]) {

            k++
            aa.add(nums[i])
            s = nums[i]


        } else if (nums[i] < s) {
            if (k > 0) k--
            }

        i++
    }
    print(aa)

    return k

}
