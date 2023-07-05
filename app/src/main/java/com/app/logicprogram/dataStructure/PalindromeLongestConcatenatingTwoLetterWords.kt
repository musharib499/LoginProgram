package com.app.logicprogram.dataStructure

fun main() {
    val longest = longestPalindrome(arrayOf("qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"))
    println(longest)
}

fun longestPalindrome(words: Array<String>): Int {
    val wordsSet = HashMap<String,Int>()
    var count = 0
    var leftSt = ""
    var rightSt = ""
    words.forEach {
        val reversed = it.reversed()
        if(wordsSet.contains(reversed)) {
            leftSt += it
            wordsSet.remove(reversed)
        } else {
            wordsSet[it] = 1
        }
    }

    wordsSet.forEach {
        if (it.key == it.key.reversed()) count = 2
    }

    return leftSt.length*2 + count
}