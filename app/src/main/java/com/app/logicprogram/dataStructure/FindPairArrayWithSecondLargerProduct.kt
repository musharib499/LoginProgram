package com.app.logicprogram.dataStructure

fun main() {
  //println(findPairSecondLargestProduct(intArrayOf(10, 20, 12, 40, 50)))
 // println(findPairSecondLargestProduct(intArrayOf(5, 2, 67, 45, 160, 78)))
    val kotlin = Hello( "BYE")
    val k = kotlin.apply {
        name = "Hello"
    }
    println(k)

}
data class Hello(var name:String)

fun findPairSecondLargestProduct(intArray: IntArray):Pair<Int,Int> {
    var first = 0
    var second = 0
    var third = 0
    intArray.forEach {
        if (it>first) {
            third = second
            second = first
            first = it

        } else if (it>second && it<first) {
            third = second
            second = it
        }

    }
return Pair(third,first)
}