package com.app.logicprogram.dataStructure

fun main() {
    val st = removeDuplicateLetterss("cbacdcbc")
    println(st)
}

fun removeDuplicateLetterss(s: String): String {
    val hashMap = mutableMapOf<Char, Int>()

    for (e in s) {
        if (hashMap.contains(e)) {
            hashMap[e] = hashMap.getValue(e) + 1
        } else {
            hashMap[e] = 1
        }
    }


    var i = 0

    val hSet = mutableSetOf<Char>()
    for (it in s) {
        hashMap[it] = hashMap[it]!! - 1
        if (!hSet.contains(it)) {
            while (hSet.isNotEmpty() && it < hSet.last() && hashMap[hSet.last()]!! > 0) {
                hSet.remove(hSet.last())
            }
            hSet.add(it)
        }


        i++

    }
    return hSet.joinToString("")
}