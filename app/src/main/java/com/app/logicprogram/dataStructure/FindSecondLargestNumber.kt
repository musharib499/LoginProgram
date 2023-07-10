package com.app.logicprogram.dataStructure

fun main() {
    println(findSecondLargestNumber(intArrayOf(10, 10,10)))
}

fun findSecondLargestNumber(intArray: IntArray):Int {
    var first = 0
    var second = 0
    intArray.forEach {
        if (it>first) {
            second = first
            first = it
        } else if (it>second && it<first) {
            second = it
        }

    }
    return second
}