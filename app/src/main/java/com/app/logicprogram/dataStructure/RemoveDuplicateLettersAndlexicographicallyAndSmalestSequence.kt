package com.app.logicprogram.dataStructure

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

/**
 * Created by Musharib Ali on 17/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
   print(removeDuplicateLettersHasMap("bcabc"))
}

fun removeDuplicateLettersHasMap(s:String):String {
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

    fun removeDuplicateLetters(s: String): String {
        val c = s.toCharArray()
        var lastIndex = IntArray(s.length)
        for (i in c.indices) {
            lastIndex[c[i] - 'a'] = i
            println("${c[i]},${c[i] - 'a'},==$i")
        }
        lastIndex.forEachIndexed { index, i ->
            println(i)
        }

        val used = BooleanArray(s.length)
        val ans = StringBuilder()
        for (i in c.indices) {
            if (used[c[i] - 'a']) continue

            while (ans.length > 0 && ans.get(ans.length - 1) > c[i] && lastIndex[ans.get(ans.length - 1) - 'a'] > i) {
                used[ans.get(ans.length - 1) - 'a'] = false
                ans.deleteCharAt(ans.length - 1)
            }

            ans.append(c[i])
            used[c[i] - 'a'] = true


        }


        return ans.toString()
    }




