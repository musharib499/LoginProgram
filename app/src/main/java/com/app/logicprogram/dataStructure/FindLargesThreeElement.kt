package com.app.logicprogram.dataStructure

import java.util.TreeSet

fun main() {
    findThreeHigestNumber(intArrayOf(10,10, 4, 3, 50, 23, 90))
    findThreeLargeNumber(intArrayOf(10,10, 4, 3, 50, 23, 90))
}


// Time Complexity: O(n)
//Auxiliary Space: O(1)
// Best solution
fun findThreeLargeNumber(intArray: IntArray) {
    var first = 0
    var second = 0
    var third = 0
    intArray.forEach {

        if (it>first) {
            third = second
            second = first
            first = it
        } else if (it>second) {
            third = second
            second = it
        }

    }
    println(first)
    println(second)
    println(third)

}




// Time Complexity: O(n)
//Auxiliary Space: O(n)
fun findThreeHigestNumber(intArray: IntArray) {

    var hasSet = TreeSet<Int>()
    intArray.forEach {
        hasSet.add(it)
    }
   var j =0
   while(j<3)    {
       println(hasSet.pollLast())
       j++
   }
}

