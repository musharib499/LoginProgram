package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    val kotlin = threeSum(intArrayOf(-1,0,1,2,-1,-4))
    println(kotlin)
}


fun threeSum(nums: IntArray): List<List<Int>> {
    nums.sort()

    val list = mutableListOf<List<Int>>()

    for(i in nums.indices) {

        if(i>0  && nums[i] == nums[i-1]) continue

        var l = i+1
        var r = nums.size-1
        while (l<r) {

            val sum = nums[i] + nums[l] + nums[r]
            when {
                sum > 0 -> r--
                sum < 0 -> l++
                else -> {
                    list.add(listOf(nums[i],nums[l],nums[r]))
                    l++

                    while (nums[l] == nums[l-1] && l<r) {l++ }
                }
            }
        }
    }

    return list
}