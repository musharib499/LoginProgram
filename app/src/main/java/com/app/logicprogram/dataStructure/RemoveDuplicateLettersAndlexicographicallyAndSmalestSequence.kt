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
    var h = HashMap<Char, Int>()
    for (item in s) {
        if (h.containsKey(item)) {
            h.put(item, (h.get(item)?.plus(1) ?: 0))
        } else {
            h.put(item, 1)
        }
    }
    var resultStack = Stack<Char>()
    var resultMap = HashSet<Char>()
    for (char in s) {
        if (!resultMap.contains(char)) {
            while (resultStack.size > 0) {
                var top = resultStack[resultStack.size - 1]
                if (top < char || h.get(top) == 0) {
                    break
                }

                resultStack.pop()
                resultMap.remove(top)

            }

            resultStack.push(char)
            resultMap.add(char)

        }
        h.put(char,(h.get(char)?.minus(1)?:0))
    }
       print("${resultStack},${resultMap}")
        return resultStack.joinToString("")
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




