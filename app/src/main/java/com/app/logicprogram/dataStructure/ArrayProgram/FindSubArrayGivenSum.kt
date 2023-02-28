package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
   println(getSubArray(intArrayOf(1, 4, 20, 3, 10, 5),33).contentToString())
}
/**
Time Complexity: O(N)
Auxiliary Space: O(1). Since no extra space has been taken.
* */
private fun getSubArray(array: IntArray,sum:Int):IntArray?{
    var currentSum = array.first()
    var start = 0
    array.forEachIndexed loop@{ index, element ->
        if (index == 0) {
            return@loop
        }
        while (currentSum>sum && start<index) {
            currentSum -= array[start]
            start++
        }

        if (currentSum == sum) {
            return array.copyOfRange(start,index)
        }
            currentSum += element

    }

    return null

}