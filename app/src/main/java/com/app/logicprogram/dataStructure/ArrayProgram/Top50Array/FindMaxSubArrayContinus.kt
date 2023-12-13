package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
   getMaxSubArray(intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3)).apply {
       println("$first - $second")
   }
}

fun getMaxSubArray(intArray: IntArray) : Pair<Int,Int> {

    var max = Int.MIN_VALUE
    var max_end = 0
    var start = 0
    var end = 0
    var s = 0

    intArray.forEachIndexed { i, e ->
      max_end += e
      println("Max_end : $max_end")
      if (max < max_end) {
          max = max_end
          start = s
          end = i

      }
        println("Max : $max")
      if (max_end<0) {
          max_end = 0
          s = i+1
      }

    }

  return Pair(start,end)
}