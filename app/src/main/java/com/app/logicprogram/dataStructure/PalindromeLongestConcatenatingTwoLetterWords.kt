package com.app.logicprogram.dataStructure

fun main() {
    val longest = longestPalindromeCount(arrayOf("qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"))
    val longestString = longestPalindromeString(arrayOf("qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"))
    println(longest)
    println(longestString)
}

fun longestPalindromeCount(words: Array<String>): Int {
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
        if (it.key == it.key.reversed()) count = 1
    }

    return (leftSt.length + count)*2
}

fun longestPalindromeString(words: Array<String>): String {
    val wordsSet = HashMap<String,Int>()
    var reamingString = ""
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
        if (it.key == it.key.reversed()) reamingString = it.key
    }

    return leftSt + reamingString + leftSt.reversed()
}