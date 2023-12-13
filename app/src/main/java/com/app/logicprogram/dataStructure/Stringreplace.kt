package com.app.logicprogram.dataStructure

import java.util.LinkedList
import java.util.Queue
import java.util.Stack

fun main() {
   gcdOfStrings("ABCDEF","ABC").apply { println(this) }
    canPlaceFlowers(intArrayOf(0,0,1,0,1),2).apply{ println(this) }
    var s = "Hello".toCharArray()
    s[1]= s[4]
    println(s)

    productExceptSelf(intArrayOf(1,2,3,4))

    compress(charArrayOf('a','a','b','b','c','c','c'))
    isSubsequence("abc", "ahbgdc").apply {
        println(this)
    }
    findMaxAverage(intArrayOf(1,12,-5,-6,50,3),4).apply {
        println(this)
    }
    maxVowels("abciiidef",3).apply {
        println(this)
    }
    maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)).apply {
        println(this)
    }
    longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1),0).apply {
        println(this)
    }

}

fun gcdOfStrings(str1: String, str2: String): String {
    if (str1.length < str2.length) {
        return gcdOfStrings(str2, str1);
    }

    // If str1 is not the
    // concatenation of str2
    else if (!str1.startsWith(str2)) {
        return "";
    }

    else if (str2.isEmpty()) {

        // GCD string is found
        return str1;
    }
    else {

        // Cut off the common prefix
        // part of str1 & then recur
        val st = str1.substring(str2.length)
        return gcdOfStrings(st, str2);
    }



}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var flowerbed1 = flowerbed.toMutableList()

    if(flowerbed1.isEmpty()) return false

    var newPlant = n
    var i = 1
    if(flowerbed1[0] == 0 && flowerbed1[1] ==0 ){
        flowerbed1[0] = 1
        newPlant--
    }

    if(flowerbed1[flowerbed1.size-1] == 0 && flowerbed1[flowerbed1.size-2] ==0 ){
        flowerbed1[flowerbed1.size-1] = 1
        newPlant--
    }
    while(i<flowerbed1.size && newPlant>0) {
        if( i-1>0
            && i+1 < flowerbed1.size
            && flowerbed1[i] == 0
            && flowerbed1[i-1] == 0
            && flowerbed1[i+1] == 0 ) {
            flowerbed1[i] = 1
            newPlant--
        }
        i++


    }



    return newPlant == 0

}

fun productExceptSelf(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    var mod = 1
    for(i in 0 until nums.size) {
        res[i] = mod
        mod *= nums[i]
    }
    println(res.joinToString())
    mod = 1
    for(j in nums.size-1 downTo 0) {
        res[j] *= mod
        mod *= nums[j]
    }

    return res




}

fun compress(chars: CharArray): Int {

    var hash = HashMap<Char, Int>()

    chars.forEach {
        hash.merge(it,1) {old, new -> old+new}
    }
    var result = 0
    var j = 0
    var newChar = mutableListOf<Any>()
    for((key,value) in hash) {
        if(value>1) {
            newChar.add(key)
            newChar.add(value)

        } else {
            newChar.add(key)
        }
    }
 println(newChar.joinToString())
    return j
}

fun isSubsequence(s: String, t: String): Boolean {
    var stack : Queue<Char> = LinkedList()

    s.forEach {
        stack.add(it)
    }
    if(stack.isEmpty()) return false

    t.forEach {
        if(it == stack.peek()) {
            if(!stack.isEmpty()) stack.poll() else return true
        }
    }

    return stack.isEmpty()


}

fun findMaxAverage(nums: IntArray, k: Int): Double {

    var maxAverage = 0

    for (i in 0 until k) { maxAverage += nums[i]  }
    var sum = maxAverage
    for (i in k until nums.size) {
        sum += nums[i]
        sum -= nums[i-k]
        maxAverage = maxOf(sum,maxAverage)
    }


    return maxAverage.toDouble()/k

}

fun maxVowels(s: String, k: Int): Int {

    var hash = HashSet<Char>().apply {
        add('a')
        add('e')
        add('i')
        add('o')
        add('u')
        add('A')
        add('E')
        add('I')
        add('O')
        add('U')
    }
    var maxVowel = 0
    var q  = 0
    var i = 0
    var count = 0

    while(i < s.length) {
        count += if(hash.contains(s[i])) 1 else 0
        q++
        if(q == k) {
            maxVowel = Math.max(maxVowel,count)
            count = 0
            i -= q-1
            q = 0
        }
        i++
    }

    return maxVowel

}

fun maxArea(height: IntArray): Int {
    var maxValue = Int.MIN_VALUE

    var l = 0
    var r = height.size-1

    while(l<r) {
        var d = r - l
        println("$d, $l,$r")
        var min = 0
         if(height[l]<height[r]) {
           min = height[l]
            l++
        } else {

           min = height[r]
            r--
        }
        println("$min")
        maxValue = Math.max(maxValue, min*d)


    }
    return maxValue

}

fun longestOnes(nums: IntArray, k: Int): Int {

    var k1 = 0
    var i = 0
    var max = Int.MIN_VALUE
    var count = 0



    while(i<nums.size) {

        if(nums[i] == 1 || k1<k) {
            if (nums[i] == 0) k1++
            count++
            i++
        } else {
            max = Math.max(count,max)
            i -= count - 1
            k1 = 0
            count = 0
        }
    }

    return max

}