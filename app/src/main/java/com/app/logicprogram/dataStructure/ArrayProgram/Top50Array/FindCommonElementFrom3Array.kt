package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
   getCommonElement(intArrayOf(1, 5, 10, 20, 40, 80), intArrayOf(6, 7, 20, 80, 100), intArrayOf(3, 4, 15, 20, 30, 70, 80, 120)).apply {
       println(this)
   }

    getCommonElement(intArrayOf(1, 5, 5), intArrayOf(3, 4, 5, 5, 10), intArrayOf(5, 5, 10, 20)).apply {
        println(this)
    }
}

fun getCommonElement(a: IntArray,b:IntArray,c:IntArray) : List<Int>{
    var i = 0
    var j = 0
    var k = 0
    val list = mutableListOf<Int>()
    while (i<a.size && j<b.size && k<c.size) {
        when {
            a[i] == b[j] && b[j] == c[k] -> {
                list.add(a[i])
                i++
                j++
                k++
            }
            a[i] < b[j] -> i++
            b[j] < c[k] -> j++
            else -> k++
        }
    }

  return list

}