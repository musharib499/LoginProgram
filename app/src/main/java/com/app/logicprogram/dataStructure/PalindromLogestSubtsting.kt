package com.app.logicprogram.dataStructure


fun main() {
 val p = findLongestPalindromic("abccccdd")
    println(p)
}


fun findLongestPalindromic(str:String) :String {

    var res = ""
    var maxLength = 0

    str.forEachIndexed { i , num ->

        var l = i
        var r = i

        while (l>=0 && r < str.length && str[l] == str[r]) {
            if (r-l+1 > maxLength ) {
                res = str.substring(l, r+1)
                maxLength = r-l+1
            }
            l--
            r++
        }


         l = i
         r = i + 1

        while (l>=0 && r < str.length && str[l] == str[r]) {
            if (r-l+1 > maxLength ) {
                res = str.substring(l, r+1)
                maxLength = r-l+1
            }
            l--
            r++
        }


    }
    return res

}