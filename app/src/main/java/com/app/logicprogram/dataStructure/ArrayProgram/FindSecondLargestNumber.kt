package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    val array = arrayOf<Int>(12, 35, 1, 10, 34, 1)
  println(findSecondLargestNumber(array))
}

private fun findSecondLargestNumber(array: Array<Int>?):Int {
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    array?.forEach { element ->

        when {
            element > first -> {
                second = first
                first = element
            }
            element > second && first != element -> {
                second = element
            }
        }

    }
   return second

}