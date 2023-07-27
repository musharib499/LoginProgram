package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
  //  println(rotate(intArrayOf(1,2,3),4).joinToString())
    println(rotateBest(intArrayOf(1,2,3,4,5,6,7),3).joinToString())
}
// Best Soluction

fun rotateBest(nums: IntArray, k: Int): IntArray {
    val n = nums.size
    val temp = IntArray(n)
    nums.forEachIndexed {index, element ->
        temp[(index+k)%n] = element

    }

    return temp

}

fun rotate(nums: IntArray, k: Int): IntArray {
    var n =  nums.size - 1
    if(k == n+1) return nums
    if(k == 0) return nums
    if(n == 0) return  nums
    if(n == 1) return reverser(nums, 0 , n)

    var end = if(k>n) k-(n+1) else k

    var listLeft = reverser(nums, 0 , n - end )
    var listRight = reverser(listLeft, n - end+1 , n)

    return reverser(listRight, 0 , n)
}

fun reverser(nums:IntArray, start:Int,end:Int):IntArray {

    var left = start
    var right = end

    while(left<right) {

        var temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
        left++
        right--

    }
    return nums

}