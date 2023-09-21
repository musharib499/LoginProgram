package com.app.logicprogram.dataStructure

fun main() {
 println(lengthOfLastWord("My name musharib"))
}

fun lengthOfLastWord(s: String): Int {
    var count  = 0
    for (i in s.length-1 downTo 0) {
        if(s[i] != ' ') {
            count++
        }else {
            if(count>0) break
        }
    }

    return count



}
