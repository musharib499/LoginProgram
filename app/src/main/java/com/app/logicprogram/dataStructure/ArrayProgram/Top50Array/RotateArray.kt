package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
//  rotateArray1Position(intArrayOf(1,2,3,4,5)).forEach {
//      println(it)
//  }

    rotateArrayKPosition(intArrayOf(1,2,3,4,5), 2).forEach {
        println(it)
    }
}

fun rotateArray1Position(intArray: IntArray) : IntArray {
    var last = intArray[intArray.size-1]

    for (i in intArray.size-1 downTo 1) {
           intArray[i] = intArray[i-1]
    }
    intArray[0] = last
    return intArray
}

fun rotateArrayKPosition(intArray: IntArray, k:Int) : IntArray {
    var j = k
    var m = 0
    while(j>0) {
        val last = intArray[intArray.size - 1]
        for (i in intArray.size - 1 downTo m+1) {
            intArray[i] = intArray[i - 1]
        }
        intArray [m] = last
        j--
        m++
    }
    return intArray
}