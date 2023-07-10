package com.app.logicprogram.dataStructure

fun main() {
  println(findThreeElementSum(intArrayOf(1 , 2 , 3 , 4 , 5), intArrayOf(2 , 3 , 6 , 1 , 2), intArrayOf(3 , 2 , 4 , 5 , 6),20))
}

fun findThreeElementSum(a1: IntArray,a2: IntArray,a3: IntArray, sum:Int):String {

    var hashSet = HashSet<Int>()
    a1.forEach {
        hashSet.add(it)
    }
    for (i in a2.indices) {
         for (j in a3.indices) {
             if (hashSet.contains(sum-(a2[i]+a3[j]))) {
                 println("${sum-(a2[i]+a3[j])},${a2[i]},${a3[j]}")
                 return "YES"
             }
         }
    }
    return "NO"
}