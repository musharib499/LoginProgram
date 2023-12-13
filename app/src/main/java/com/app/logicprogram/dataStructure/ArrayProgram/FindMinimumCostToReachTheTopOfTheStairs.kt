package com.app.logicprogram.dataStructure.ArrayProgram

import kotlin.math.min

fun main() {
   //val minCast = findMinimumCast(intArrayOf(1,100,1,1,1,100,1,1,100,1))
   // println(minCast)
    println(countSymmetricIntegers(1,100))
}

fun  findMinimumCast(array: IntArray):Int {
    val n = array.size
    val dp = IntArray(n+1){0}
    for (i in 2..n) {
        dp[i] = min(dp[i-1]+array[i-1], dp[i-2]+array[i-2])
    }
    return dp[n]
}

fun countSymmetricIntegers(low: Int, high: Int): Int {
    var count = 0
    for(i in low..high) {
        val s = i.toString()
        val n = s.length
        if(n%2 == 1) continue


        var sum = 0
        for(i in 0 until n/2) {
            sum += s[i] - '0'
            sum -= s[n-i-1] - '0'
        }
        if(sum == 0) count++


    }
    return count
}