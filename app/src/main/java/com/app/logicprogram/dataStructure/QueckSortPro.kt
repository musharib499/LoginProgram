package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 10/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    val arr = arrayListOf(10, 80, 30, 90, 40, 50, 70)
    println(quickSort(arr))
}

fun quickSort(a: ArrayList<Int>) {
    print(sort(a, 0, a.size - 1).toString())
}

fun sort(a: ArrayList<Int>, l: Int, r: Int): ArrayList<Int> {
    if (l < r) {
        var p = partition(a, l, r)
        sort(a, l, p - 1)
        sort(a, p + 1, r)
    }
    return a

}

fun partition(a: ArrayList<Int>, l: Int, r: Int): Int {
    val p = a[r]
    var i = l - 1
    var j = l

    while (j < r) {
        if (a[j] < p) {
            i++
            var temp = a[i]
            a[i] = a[j]
            a[j] = temp


        }
        j++
    }
    var tem = a[i + 1]
    a[i + 1] = a[r]
    a[r] = tem
    return i + 1
}