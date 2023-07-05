package com.app.logicprogram.dataStructure

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(romanToInt("III"))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var result = strs[0]
    strs[0].forEach {
        strs.forEach {
            if (it.indexOf(result) != 0) {
                result = result.substring(0, result.length - 1)
            }
            if (result.isEmpty()) {
                return ""
            }
        }


    }
//    for (i in strs.indices) {
//        while (strs[i].indexOf(result) != 0) {
//
//            result = result.substring(0, result.length -1)
//
//            if(result.isEmpty()) {
//                return ""
//            }
//        }
//    }
    return result

}

fun romanToInt(s: String): Int {
    val hashMap = HashMap<Char, Int>()
    hashMap.put('I',1)
    hashMap.put('V',5)
    hashMap.put('X',10)
    hashMap.put('L',50)
    hashMap.put('C',100)
    hashMap.put('D',500)
    hashMap.put('M',1000)
    var result = 0
    var prvious = 0
    for(i in s.indices.reversed()) {
        val current = hashMap.getValue(s[i])!!
        if(current >= prvious) {
            result += current
        } else {
            result -= current
        }
       prvious = current
    }

    return result

}

