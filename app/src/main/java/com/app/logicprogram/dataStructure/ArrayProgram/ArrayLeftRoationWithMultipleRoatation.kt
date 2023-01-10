package com.app.logicprogram.dataStructure.ArrayProgram

import android.provider.Settings.Global
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
//    runBlocking {
//        multipleRotation(arrayOf(1, 3, 5, 7, 9), arrayOf(1, 3, 4, 5, 6))
//    }
    reversalLeftArrayWithRotation(arrayOf(1, 3, 5, 7, 9), 1)
    reversalLeftArrayWithRotation(arrayOf(1, 3, 5, 7, 9), 3)
    reversalLeftArrayWithRotation(arrayOf(1, 3, 5, 7, 9), 4)
    reversalLeftArrayWithRotation(arrayOf(1, 3, 5, 7, 9), 5)
    reversalLeftArrayWithRotation(arrayOf(1, 3, 5, 7, 9), 6)
}


private suspend fun multipleRotation(array: Array<Int>, degree: Array<Int>) {
    degree.forEach { element ->
        println(element)
        reversalLeftArrayWithRotation(array, element)
        delay(2000)
    }
}

private fun reversalLeftArrayWithRotation(array: Array<Int>, d: Int){
    var a = array
    var q = d
    val n = a.size - 1
    // q is grater than n cover this case modules
    if (q > n) q %= (n + 1)
    a = reversLeftArray(a, 0, q-1)
    a = reversLeftArray(a, q, n)
    println(reversLeftArray(a, 0, n).contentToString())

}

fun reversLeftArray(array: Array<Int>, start: Int, end: Int): Array<Int> {
    var s = start
    var e = end
    if (s==e || s>e) return array
    while(s<e){
        val t = array[s]
        array[s] = array[e]
        array[e] = t
        s++
        e--
    }

    return array
}