package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
    val list = listOf<IntArray>(intArrayOf(1,423,6,46,34,23,13,53,4), intArrayOf(12, 1234, 45, 67, 1 ), intArrayOf(1,2,3,4))
    list.forEach {
        getReverserArray(it).apply {
            println(this.contentToString())
        }
    }


}

fun getReverserArray(intArrayOf: IntArray): IntArray {
    val n = intArrayOf.size
    for (i in 0 until n / 2) {
        val t = intArrayOf[i]
        intArrayOf[i] = intArrayOf[n - i -1]
        intArrayOf[n - i - 1] = t
    }
    return intArrayOf
}
