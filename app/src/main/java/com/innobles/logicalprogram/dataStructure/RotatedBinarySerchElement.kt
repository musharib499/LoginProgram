package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 14/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    //println(search(intArrayOf(4,5,6,7,0,1,2),0))
    println(maxSumSubmatrix(arrayOf(intArrayOf(2,2,-1)),0))
}



fun search(nums: IntArray, target: Int): Int {
    if(nums.size == 0) return -1

    return binarySearch(nums,0,nums.size -1,target)

}

fun binarySearch(nums:IntArray,start:Int,end:Int,key:Int):Int {
    if (start > end) return -1

    var mid: Int = (start + end) / 2

    if (nums[mid] == key) return mid

    if (nums[start] <= nums[mid]) {
        if (key >= nums[start] && key <= nums[mid])
            return binarySearch(nums, start, mid - 1, key)

        return binarySearch(nums, mid + 1, end, key)

    }
    if(key >= nums[mid] && key <= nums[end]) return binarySearch(nums,mid+1,end,key)
    return binarySearch(nums,start,mid-1,key)
}


fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int {
    var max:Int = -100
    for(i in 0..(matrix.size-1)){
        var p = 0
        for(q in 0..(matrix[i].size-1) ){
            p += if (matrix[i][q]>k ) k else matrix[i][q]
        }
        if(max<p) max = p
    }

    return if(max>k)k else max
}