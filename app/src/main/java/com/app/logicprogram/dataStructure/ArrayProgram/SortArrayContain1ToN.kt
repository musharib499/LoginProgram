package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    println(sortArrayOneToN(arrayOf<Int>(10, 7, 9, 2, 8, 3, 5, 4, 6, 1)).contentToString())
    println(sortArrayOneToN(arrayOf<Int>(3, 2, 5, 6, 1, 4)).contentToString())
}


private fun sortArrayOneToN(array: Array<Int>): Array<Int> {
    val h = HashMap<Int, Int>()
    array.forEachIndexed { index, i ->
        h[i] = index + 1
    }

    array.forEachIndexed { index, i ->
        if (h.containsKey(index + 1)) {
            array[index] = index + 1
            h.remove(index + 1)
        }
    }
    h.clear()
    return array
}