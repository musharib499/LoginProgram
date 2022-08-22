package com.app.logicprogram.dataStructure.patternSerching

/**
 * Created by Musharib Ali on 23/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    //searchingPattern("THIS IS A TEST TEXT","TEST")
    //searchingPattern("AABAACAADAABAABA","AABA")
    /// secondSearchingPattern("AABAACAADAABAABA","AABA")
    secondSearchingPattern("THIS  TEST IS A TEST TEXT TEST", "TEST")
}

fun searchingPattern(first: String, second: String) {

    val n = first.length
    val m = second.length
    var i = 0
    while (i <= (n - m)) {
        var j = 0
        while (j < m) {
            if (first[i + j] != second[j]) break
            j++
            if (j == m) println(i)


        }
        i++
    }

}

// Best Solution
fun secondSearchingPattern(first: String, second: String) {

    val n = first.length
    var i = 0
    while (i <= n - second.length) {
        if (i == getPosition(first, second, i, second.length - 1)) println(i)
        i++
    }

}

fun getPosition(first: String, second: String, i: Int, k: Int): Int {
    if (k == 0) return i
    if (first[i + k] != second[k]) return -1
    return getPosition(first, second, i, k - 1)

}