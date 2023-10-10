package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    val N1 = 5
    val A1 = intArrayOf(2, 8, 5, 4, 3)
    val X1 = 1
   findSubsequence(N1, A1, X1).apply {
        println(this.toString())
    }
}

fun findSubsequence(n: Int, a: IntArray, x: Int): List<Int> {
    val list = mutableListOf<Int>()
    a.forEach {
        if((it and  x) == x) {
            list.add(it)
        }
    }

    if(list.isEmpty()) return listOf(-1)


    var newVal = list[0]
    for (i in 1 until list.size) {
        newVal = newVal and list[1]
    }

return if (newVal == x) list else listOf(-1)

}


