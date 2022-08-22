package com.app.logicprogram.dataStructure

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.arrayListOf
import kotlin.collections.forEach

/**
 * Created by Musharib Ali on 22/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    println(getSubStringCount("geekforgeek", "for"))
    println(givingStringMatch("geekforgeek", "fora"))
    print(getSubArray(arrayListOf(11, 1, 13, 21, 3, 7), arrayListOf(11, 3, 7, 1)))
}
//Find substring as giving
//Find Frequency of a substring in a string
fun getSubStringCount(str:String,target:String):Int{
    var t = 0
    var k = 0
    for (element in str){
        if (target.length.equals(str.length)) break

        if (target[t] == element) t++ else t = 0

        if (t.equals(target.length)) {
            t = 0
            k += 1
        }

    }
    return k

}


fun givingStringMatch(a: String, b: String): Boolean {
    var t = 0
    var target: String = ""
    a.forEach {
        if (b.length == t) return true
        if (it.equals(b[t])) t++ else t = 0

    }
    return false
}


fun getSubArray(a: ArrayList<Int>, b: ArrayList<Int>): Boolean {
    var c = 0
    if (b.size == 0) return false
    val h = HashMap<Int, Int>()
    a.forEach {
        h.put(it, 1)
    }
    b.forEach {
          if (!h.containsKey(it)) c = 1
      }

    return c == 0
}

