package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    println(getSingleOnceElement(arrayOf(2, 3, 5, 4, 5, 3, 4,2,10,13,10)))
    println(getSingleOnceElementSum(arrayOf(2, 3, 5, 4, 5, 3, 4,2,10,13,10)))
}
/* Best Approach
Time Complexity: O(n)
Auxiliary Space: O(1)
*/
fun getSingleOnceElement(array: Array<Int>): Int {
    var r = array[0]
    array.forEachIndexed { index, element ->
        if (index > 0) {
            r = r xor element
        }
    }
    return r
}

//Another Approach
/*
Time Complexity: O(nlogn)
Auxiliary Space: O(n)
*/
fun getSingleOnceElementSum(array: Array<Int>): Int {

    val h = hashSetOf<Int>()
    var sum = 0
    var sumWithOutDuplicate = 0
    array.forEach { element ->
        sum += element
        if (!h.contains(element)) {
            h.add(element)
            sumWithOutDuplicate += element
        }
    }
    return 2 * sumWithOutDuplicate - sum
}