package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
println(kSmallestPairs(intArrayOf(1,7,11), intArrayOf(2,4,6),3))
}

fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {

    var j = 0
    var r = 0
    var k = 0
    var lastSecond = nums2[nums2.size-1]
    var firstSecond = nums1[nums1.size-1]
    var list = mutableListOf<List<Int>>()
    while(j<nums1.size && r<nums2.size && k<=3) {

        if(nums1[j+1] >= nums2[r]) {
            list.add(listOf(nums1[j], nums2[r]))
            k++
            r++

        } else if (nums2[r+1] >= nums1[j]) {
            list.add(listOf(nums1[j], nums2[r]))
            j++
            k++
        }

    }
    return list



}