package com.app.logicprogram.dataStructure.sorting

/**
 * Created by Musharib Ali on 16/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    heapSort(arrayListOf(4, 10, 3, 2, 5))
}

fun heapSort(a: ArrayList<Int>) {
    for (i in a.size / 2 - 1 downTo 1) {
        heapSortFunction(a, i, a.size)
    }
    for (i in a.size - 1 downTo 1) {
        val t = a[0]
        a[0] = a[i]
        a[i] = t
        heapSortFunction(a, 0, i)
    }

    println(a.toString())
}

fun heapSortFunction(a: ArrayList<Int>, i: Int, n: Int) {
    var larger = i
    var left = 2 * i + 1
    var right = 2 * i + 2
    if (left < n && a[left] > a[larger]) larger = left
    if (right < n && a[right] > a[larger]) larger = right
    println(a.toString())
    if (i != larger) {
        val t = a[i]
        a[i] = a[larger]
        a[larger] = t
        println(a.toString())
        heapSortFunction(a, larger, n)
    }

}