package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {

    duplicateNumberFromArray(intArrayOf( -1, 6, 3, -1, 3, 6, 6)).apply {
        println(this)
    }

}

// only contains elements from 0 to n-1 no valid grater number larger then index
fun duplicateNumberFromArray(intArray: IntArray):List<Int>{
    val list = mutableListOf<Int>()

    val n = intArray.size

    intArray.forEach {
        val nexIndex = it % n
        intArray[nexIndex] += n
    }

    intArray.forEachIndexed() {index,it ->
        if (it/n >= 2) {
            list.add(index)
        }
    }


    return list
}