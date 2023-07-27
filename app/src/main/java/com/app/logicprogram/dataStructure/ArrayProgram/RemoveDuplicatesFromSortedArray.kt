package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
 //  var lastIndex = removeDuplicateElementFromSortedArrayAndPrintArray(intArrayOf(0,0,1,1,1,2,2,3,3,4))
    removeDuplicatesfromSortedArrayII(intArrayOf(0,0,1,1,1,2,2,3,3,4))
    removeDuplicatesfromSortedArrayII_(intArrayOf(0,0,1,1,1,2,2,3,3,4))

}

fun removeDuplicateElementFromSortedArrayAndPrintArray(nums: IntArray): Int {
    var hashMap = HashMap<Int,Boolean>()
    var k  =0
    nums.forEach {
        if (hashMap[it] != true) {
            hashMap[it] = true
            nums[k] = it
            k++
        }
    }

    return k
}
/*
* Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

*/
// Time Complexity (n)
// Space Complexity (n)
fun removeDuplicatesfromSortedArrayII(nums: IntArray): Int {
    var k = 0
    var hashMap = HashMap<Int,Int>()
    nums.forEach {

        if(!hashMap.contains(it)) {
            nums[k] = it
            hashMap.put(it,1)
            k++
        } else if (hashMap.contains(it) && hashMap.getValue(it) <2) {
            nums[k] = it
            hashMap.put(it,hashMap.getValue(it) + 1)
            k++
        } else {
            hashMap.put(it,hashMap.getValue(it) + 1)
        }
    }
    return k

}

fun removeDuplicatesfromSortedArrayII_(nums: IntArray): Int {
    var k = 1
    var j = 1
    while (j < nums.size) {
        if (nums[k] != nums[j] || nums[k-1] != nums[j]) {
            nums[++k] = nums[j]
        }
        j+=1
    }
    return k+1

}


