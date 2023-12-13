package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
    getCountSubArray(intArrayOf(1, 0, 0, 1, 0, 1, 1)).apply {
        println(this)
    }
}

fun getCountSubArray(intArrayOf: IntArray): Int {

    val hash = HashMap<Int,Int>()
    var sum = 0
    var count = 0
    intArrayOf.forEach {
        var value = it
        if (value == 0) {
            value = -1
        }
        sum +=value
        if(sum == 0) {
            count++
        }
        if(hash.containsKey(sum)) {
            count += hash.getValue(sum)
        }
        hash.merge(sum,1) {old,new -> old+new}
    }

    return count

}



