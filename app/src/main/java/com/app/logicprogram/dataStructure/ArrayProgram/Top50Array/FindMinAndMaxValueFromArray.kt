package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

import kotlin.math.max
import kotlin.math.min

fun main() {


    val list = listOf<IntArray>(intArrayOf(1,423,6,46,34,23,13,53,4), intArrayOf(12, 1234, 45, 67, 1 ))
     list.forEach {
         findMinMaxValue(it).apply {
             println("list ${it.contentToString()} -> Max ${this.first} -Min ${this.second} ")
         }
     }


}

fun findMinMaxValue(array: IntArray):Pair<Int,Int> {

    var maxValue = Int.MIN_VALUE
    var minValue = Int.MAX_VALUE
    val n = array.size
    for (i in 0 until n/2) {
        maxValue = maxOf(maxValue, maxOf(array[i], array[n-i-1]))
        minValue = min(minValue, minOf(array[i], array[n-i-1]))

    }

    return Pair(maxValue,minValue)

}
