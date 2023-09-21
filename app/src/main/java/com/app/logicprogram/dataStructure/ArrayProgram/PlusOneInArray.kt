package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
//  var n = readln().split(",").map { it.toInt() }
  //println(plusOne(n.toIntArray()).contentToString())

    println(solution(intArrayOf(1, 3, 6, 4, 1, 2)))

}

fun plusOne(digits: IntArray): IntArray {
     var s = ""
    digits.forEach {
        s+=it
    }
    s = (s.toDouble()+1).toString()
    var array = mutableListOf<Int>()
    s.forEach {
        array.add(it.digitToInt())
    }
    123456/10

    return array.toIntArray()

}

fun solution(A: IntArray): Int {
    // Implement your solution here
    var hash = HashSet<Int>()
    A.forEach {
        hash.add(it)
    }


    for (i in 0..A.size-1) {

        if(i>0 && !hash.contains(i)) {
            return i
        }
    }
    return A.size

}



