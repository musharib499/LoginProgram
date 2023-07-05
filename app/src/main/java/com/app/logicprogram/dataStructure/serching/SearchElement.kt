package com.app.logicprogram.dataStructure.serching

import android.os.Build
import androidx.annotation.RequiresApi
import kotlin.math.abs

/**
 * Created by Musharib Ali on 23/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
   // println(findNumber(intArrayOf(1), 1))
   // println(majorityElement(intArrayOf(2,2)))
   // println(sortColors(intArrayOf(2,0,2,1,1,0)).contentToString())
  //  println(checkStraightLine(arrayOf(intArrayOf(1,-8), intArrayOf(2,-3), intArrayOf(1,2))))
 //   println(isAnagram("rat","cat"))

}


fun findNumber(a: IntArray, value: Int): Int {
    var l = 0
    var r = a.size
    while (l < r) {
        var m = (l + r) / 2
        if(value == a[m]) return m
        var left = getValue(a, l, m, value)
        var right = getValue(a, m + 1, r, value)
        if (left > -1) return left else l++
        if (right > -1) return right else r--

    }
    return -1
}

fun getValue(a: IntArray, l: Int, r: Int, value: Int): Int {
    if (l >= r) return -1
    if (value == a[l]) return l
    return getValue(a, l + 1, r, value)
}

@RequiresApi(Build.VERSION_CODES.N)
fun majorityElement(nums: IntArray): List<Int> {
    val n = nums.size
    val hashMap = mutableMapOf<Int,Int>()
    nums.forEach{
        hashMap.merge(it,1){old, new -> old+new}
    }
    return hashMap.entries.filter { it.value>n/3 }.map { it.key }

}

@RequiresApi(Build.VERSION_CODES.N)
fun sortColors(nums: IntArray): IntArray {

    var hashMap = HashMap<Int,Int>()
    nums.forEach {
        hashMap.merge(it,1) {old, new -> old+new}
    }
    val one = hashMap.getValue(1)
    val zero = hashMap.getValue(0)  -1
    for(i in nums.indices) {
        when(i) {
            in 0..zero -> {
                nums[i] = 0

            }
            in zero..one + zero -> {
                nums[i] = 1

            }
            else -> nums[i] = 2
        }
    }
   return nums
}

fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    if(coordinates.size <= 2) return true

    val xDiff = abs(coordinates[1][0] - coordinates[0][0])
    val yDiff = abs(coordinates[1][1] - coordinates[0][1])

    var l = 2
    while (l<coordinates.size) {

        val currentX = abs(coordinates[l][0] - coordinates[l-1][0])
        val currentY = abs(coordinates[l][1] - coordinates[l-1][1])
        if(currentX*yDiff != currentY*xDiff) return false
        l++
    }

    return true
}

@RequiresApi(Build.VERSION_CODES.N)
fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    var hMap = mutableMapOf<Char,Int>()
    s.forEach {
        hMap.merge(it, 1) {old,new -> old+new}
    }

    t.forEach {
        hMap.merge(it, 1) {old,new -> old-new}

    }

    return hMap.filterValues {it>=1}.isEmpty()

}

