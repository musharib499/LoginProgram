package com.app.logicprogram.dataStructure

import kotlin.math.min

fun main() {
    val profit = maxProfit(intArrayOf(7,1,5,3,6,4))
    println(profit)
}

fun maxProfit(prices: IntArray): Int {
    var left = 0
    var right = 1
    var maxProfit = 0
    while(left<prices.size && right<prices.size ) {

        if (prices[left] < prices[right]) {
            maxProfit = maxOf(maxProfit, prices[right] - prices[left])
        } else {

            left = right
        }
        right++

    }
  return maxProfit

}