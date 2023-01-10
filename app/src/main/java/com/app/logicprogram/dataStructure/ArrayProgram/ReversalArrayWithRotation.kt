package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    println(reversalArrayWithRotation(arrayOf(1, 2, 3, 4, 5, 6, 7), 2).contentToString())
}

private fun reversalArrayWithRotation(array: Array<Int>, d: Int): Array<Int> {
    var a = array
    var q = d
    val n = a.size - 1
    // q is grater than n cover this case modules
    if (q > n) q %= (n + 1)
    a = reversArray(a, 0, q-1)
    println(a.contentToString())
    a = reversArray(a, q, n)

    println(a.contentToString())
    return reversArray(a, 0, n)

}

fun reversArray(array: Array<Int>, start: Int, end: Int): Array<Int> {
    var s = start
    var e = end
    while(e>s){
        var t = array[s]
        array[s] = array[e]
        array[e] = t
        s++
        e--
    }

    return array
}