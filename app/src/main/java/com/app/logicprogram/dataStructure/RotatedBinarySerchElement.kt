package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 14/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    //println(search(intArrayOf(4,5,6,7,0,1,2),0))
    println(maxSumSubmatrix(arrayOf(intArrayOf(2,2,-1)),0))
   // val arr = intArrayOf(2,2,-1)
   // println(binarySearch(arr,0,arr.size ,-1))
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

fun getBinaryIndex(arr:IntArray,start: Int,end: Int, number:Int) :Int {
    if (start>end) return -1

    val mid = (start+end)/2
    if (arr[mid] == number) return mid
//5, 6, 7, 8, 9, 10, 1, 2, 3 // 10
    if (arr[start] <= arr[mid]) {
        if (number >= arr[start] && number <= arr[mid]) {
          return  getBinaryIndex(arr,start,mid-1,number)
        }
        return  getBinaryIndex(arr,mid+1,end,number)
    }

    if (number >= arr[mid] && number <= arr[end]) return getBinaryIndex(arr,mid+1,end,number)

    return getBinaryIndex(arr,start,mid-1,number)
}