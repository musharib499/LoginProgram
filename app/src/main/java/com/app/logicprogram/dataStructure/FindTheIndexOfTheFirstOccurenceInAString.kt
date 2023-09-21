package com.app.logicprogram.dataStructure

fun main() {
    val first = readln()
    val second = readln()
    println(strStr(first,second))



}

fun strStr(haystack: String, needle: String): Int {
  return haystack.indexOf(needle)
}

fun plusOne(digits: IntArray): IntArray {
    var j = 0
    while(j<digits.size) {
        if(j == digits.size-1) {
            var n = digits[j] +1
            while (n>0) {
                n %= 10
                digits.plus(n)
            }

        }
        j++
    }
    return digits

}