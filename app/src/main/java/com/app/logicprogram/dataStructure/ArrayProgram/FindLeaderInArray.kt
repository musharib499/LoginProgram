package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    println(getLeaderElement(arrayOf(16, 17, 4, 3, 5, 2)).contentToString())
    println(getLeaderElement(arrayOf(1, 2, 3, 4, 5, 2)).contentToString())
}

private fun getLeaderElement(array: Array<Int>):IntArray{
    var i = array.size-1
    var aa = array.toMutableList()
    var last = Int.MIN_VALUE
    while (i>=0) {
            if (last<array[i]) {
                last = array[i]
            } else {
                aa.removeAt(i)
            }
        i--
    }
   return aa.toIntArray()
}