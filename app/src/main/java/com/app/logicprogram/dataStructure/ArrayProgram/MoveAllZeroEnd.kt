package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    var array = arrayOf<Int>(1, 2, 0, 4, 3, 0, 5, 0)
    println(moveAllZeroToEnd(array).contentToString())
}
private fun moveAllZeroToEnd(array: Array<Int>):Array<Int> {
    var count = 0
    array.forEach {
        if (it != 0){
            array[count++] = it
        }

    }
   val n = array.size

    while(count<n) {
        array[count++] = 0
    }
return array
}