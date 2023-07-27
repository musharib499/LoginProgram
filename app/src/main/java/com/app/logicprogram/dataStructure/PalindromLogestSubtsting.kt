package com.app.logicprogram.dataStructure

import java.util.TreeMap
import java.util.TreeSet


fun main() {
// val p = findLongestPalindromic("abccccdd")
//    println(p)
    println(longestPalindrome("babad"))
//  val sort:IntArray = intArrayOf(-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7)
//    sort.sort()
//
//   println(sort.joinToString())
}

fun longestPalindrome(s: String): String {
    if(s.length == 1) return s
    var result = ""
    s.forEachIndexed {index, element ->
        val first = findLogestPalindrom(s,index,index) // even
        val second = findLogestPalindrom(s,index,index+1)  // odd
        val third = if (first.length>second.length) first else second
        result = if (third.length>result.length) third else result
    }

    return result

}

fun findLogestPalindrom(s:String, left:Int,right:Int) :String {
    var res = ""
    var maxLength = 0

    var l = left
    var r = right
    while(l>=0 && r<s.length && s[l] == s[r]) {
        if(r-l+1>maxLength) {
            maxLength =  r-l+1
            res = s.substring(l,r+1)
        }
        l--
        r++
    }
    return  res
}