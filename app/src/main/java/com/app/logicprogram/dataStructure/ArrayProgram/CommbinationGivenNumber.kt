package com.app.logicprogram.dataStructure.ArrayProgram

import kotlinx.coroutines.runBlocking

fun main() {
    printArrayCombinationGivenNumber()
//    val list = mutableListOf<MutableList<Int>>()
//     getCombinationSetElement(5,2, 1,list, mutableListOf())
//    list.forEach {
//        println(it.joinToString())
//    }
}

// range [1, n], k = 4 combination set
// [1,2,3,4,5,6,7]
// [1,2,3,4], [1,3,4,5], [1,4,5,6],[1,5,6,7]...

fun printArrayCombinationGivenNumber() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val intArray = IntArray(3)
    val list = getCombination(array, array.size, 3, 0, 0, mutableListOf(), intArray)
    list.forEach {
        println(it.joinToString())
    }
}


fun getCombination(array: IntArray, n: Int, k: Int, index: Int, i: Int, list: MutableList<IntArray>, temp: IntArray): MutableList<IntArray> {


    if (index == k) {
        val pList = IntArray(k)
        for (p in 0 until k) {
            pList[p] = temp[p]
        }
        list.add(pList)
        return list
    }
    if (i >= n) return list

    val a = array[i]
    temp[index] = a
    getCombination(array, n, k, index + 1, i + 1, list, temp)
    getCombination(array, n, k, index, i + 1, list, temp)

    return list

}


//  print all combinations of size
// k of elements in set 1..n


fun getCombinationSetElement(n:Int, k:Int, left:Int, list: MutableList<MutableList<Int>>, temp: MutableList<Int>) {

    if (k == 0) {
        val pList = mutableListOf<Int>()
       temp.forEachIndexed{ index, i -> pList.add(i)}
        list.add(pList)
        return
    }

    for (i in left..n) {
        temp.add(i)
        getCombinationSetElement(n,k-1,i+1, list,temp)
        temp.removeAt(temp.size-1)
    }


}