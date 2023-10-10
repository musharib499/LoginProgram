package com.app.logicprogram.dataStructure

import java.util.Arrays
import java.util.TreeSet


fun main() {
        println(this)
    }
}

fun palindromePairs(words: Array<String>): List<List<Int>> {

    val n = words.size-1
    val list = mutableListOf<List<Int>>()

    val hashMap = HashMap<String,Int>()
    val set = TreeSet<Int>()


    words.forEachIndexed { index, s ->
        hashMap.put(s,index)
        set.add(s.length)
    }

    words.forEachIndexed { index, s ->
        val reverse = StringBuilder(s).reversed().toString()
        val length = reverse.length
        if(hashMap.contains(reverse) && hashMap.getValue(reverse) != index) {
            val p = listOf(index,hashMap.getValue(reverse))
            list.add(p)
        }
        for (k in set) {
            if (k === length) break
            if (reverse.palindromString(0, length - 1 - k)) {
                val s1: String = reverse.substring(length - k)
                if (hashMap.containsKey(s1)) list.add(listOf(index, hashMap.getValue(s1)))
            }
            if (reverse.palindromString(k, length - 1)) {
                val s2: String = reverse.substring(0, k)
                if (hashMap.containsKey(s2)) list.add(listOf(hashMap.getValue(s2), index))
            }
        }

    }

    return list


}

fun String.palindromString(left:Int,right:Int):Boolean {
    var l = left
    var r = right
    while (l<r) {
        if (this[l++] != this[r--]) {
            return false
        }
    }
    return true
}