package com.app.logicprogram.dataStructure

import com.app.logicprogram.dataStructure.collection.myTreeSet
import java.util.TreeSet
import kotlin.math.min
import kotlin.time.Duration.Companion.seconds

fun main() {
    println(secondGreaterElement(intArrayOf(2,4,0,9,6)).contentToString())
}

fun secondGreaterElement(nums: IntArray): IntArray {

    var list:IntArray = nums.sortedArray()
    var i = 0
    var secondMax = list[nums.size-2]
    var firstMax = list[nums.size-1]
    while(i<nums.size) {
        var j = i +1
        var r = 0
        var num = nums[i]
        while(j<nums.size && r<2) {
            if(nums[i] <= nums[j]) {
                num = nums[j]
                r++
            }
            j++
        }
        if(nums[i]>= secondMax) {
            nums[i] = -1
        } else {
            nums[i] = num
        }

        i++

    }
    nums[nums.size-1] = -1
    return nums
}