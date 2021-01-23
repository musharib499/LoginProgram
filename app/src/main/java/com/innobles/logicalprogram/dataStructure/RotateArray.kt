package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    //  print(rotate(intArrayOf(1, 2, 3, 4, 5, 6), 3).contentToString())
    // print(leftShift(arrayOf(1, 2, 3, 4, 5, 6),2).contentToString())
    minimumBribes(arrayOf(1, 2, 5, 3, 4, 7, 8, 6))
}

fun rotate(nums: IntArray, k: Int): IntArray {
    var q = k
    val n = nums.size - 1
    // q is grater than n cover this case modules
    if (q > n) q = q % (n + 1)

    var num = nums
    num = reverse(num, 0, n)
    num = reverse(num, 0, q - 1)
    num = reverse(num, q, n)


    return num
}

fun reverse(nums: IntArray, start: Int, end: Int): IntArray {
    var p = start
    var k = end
    while (p < k) {
        val temp = nums[p]
        nums[p] = nums[k]
        nums[k] = temp
        p++
        k--
    }
    return nums
}

fun leftShift(a: Array<Int>, d: Int): Array<Int> {

    var i = 0

    var s = IntArray(d)
    while (i < d) {
        s[i] = a[i]
        i++
    }
    i = 0
    var k = 0
    while (i < a.size) {
        val r = d + i
        if (r < a.size) {
            a[i] = a[r]
        } else {
            a[i] = s[k]
            k++
        }
        i++
    }

    return a
}

fun minimumBribes(q: Array<Int>) {
    var n = q.size
    var i = 0
    var k = 0
    println(q.contentToString())
    while (i < (n - 1)) {
        if (q[i] > q[i + 1]) {
            var diff = q[i] - q[i + 1]
            q[i] = q[i] + q[i + 1]
            q[i + 1] = q[i] - q[i + 1]
            q[i] = q[i] - q[i + 1]
            if (diff > 1) {
                i -= diff
            }
            if (i <= 0) i = 0
            k++
        }

        i += 1

    }
    println(q.contentToString())
    if (k < 1) println("Too chaotic") else println(k)


}

