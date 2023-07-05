package com.app.logicprogram.dataStructure

fun main() {
    println(merge(intArrayOf(1,2,3,0,0,0) ,3, intArrayOf(2,5,6),3))
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit{

    var last = m + n - 1
    var m1 = m-1
    var n1 = n-1
    while(m1 >= 0 && n1 >= 0 && last>=0) {
        if(nums1[m1] > nums2[n1]) {
            nums1[last] = nums1[m1]
            m1--
        } else {
            nums1[last] = nums2[n1]
            n1--
        }
        last--
    }
    while (n1 >= 0) {
        nums1[last] = nums2[n1]
        n1--
        last--
    }
}