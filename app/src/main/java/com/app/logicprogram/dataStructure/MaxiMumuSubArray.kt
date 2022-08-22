package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 28/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {

    print(maxSubArray(intArrayOf(-2,1)))

}

fun maxSubArray(nums: IntArray): Int {
    if (nums.size ==0) return 0

    if (nums.size ==1) return  nums[0]

    if (nums.size ==2) return  if ( nums[0]>nums[1]) nums[0] else nums[1]

    var first = nums[0]
    var second = nums[0]
    for(i in nums){

        if(i>=first){
            second = first
            first = i

        }else if(i> second && i != first){
            second = i
        }

    }
    return first + second

}