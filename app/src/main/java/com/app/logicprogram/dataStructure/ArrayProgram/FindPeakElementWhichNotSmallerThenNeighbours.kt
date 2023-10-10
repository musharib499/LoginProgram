package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
   println(findElementWhichIsNotSmallerThenNeighbours(intArrayOf(5, 10, 20, 15)))
   println(findElementWhichIsNotSmallerThenNeighbours(intArrayOf(10, 20, 15, 2, 23, 90, 67)))
}


fun findElementWhichIsNotSmallerThenNeighbours(array: IntArray):Int {

    var j  = array.size-1
    while (j>0) {

        if(j-2>=0  && array[j-1] >= array[j] && array[j-1] >= array[j-2]) return array[j-1]
        j--

    }

    return  -1

}


