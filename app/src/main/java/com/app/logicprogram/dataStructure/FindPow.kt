package com.app.logicprogram.dataStructure

fun main() {
    println(myPow(2.0,-2))
}

fun myPow(x: Double, n: Int): Double {
    if (n == 0) return x
    var result = 1.0
    var p = n>0

    var newNums = Math.abs(n)
    for(i in 1..newNums) {
        result *=x

    }
    return if(p) result  else 1/result

}
fun maxArrayValue(nums: IntArray): Long {

    var r = nums.size-1
    val newNum = LongArray(nums.size)
    for (i in nums.indices) {
        newNum[i] = nums[i].toLong()
    }
    while(r>0) {
        if(newNum[r-1] <= newNum[r]) {
            newNum[r-1] += newNum[r]
        }
        r--
    }
    return newNum[0]

}