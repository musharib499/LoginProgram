package com.innobles.logicalprogram

import java.util.*

/**
 * Created by Musharib Ali on 3/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    maxNumber(intArrayOf(1, 2, 3, 1, 4, 5, 2, 3, 6), 3)
    maxNumbers(intArrayOf(1, 2, 3, 1, 4, 5, 2, 3, 6), 3)
}

/*
* Complexcity O(n*k)
* Space Complexcity O(1)
*
* */
fun maxNumber(array: IntArray, k: Int) {
    var i = 0
    while (i <= array.size - k) {
        var j = i
        var max = Int.MIN_VALUE
        if (k + i <= array.size) {
            while (j < k + i) {
                if (max <= array[j]) max = array[j]
                j++
            }
            println(max)
        }

        i++
    }
}


fun maxNumbers(array: IntArray, k: Int) {
    var i = 0
    var q: Deque<Int> = LinkedList()
    while (i < k) {
        while (!q.isEmpty() && array[i] > array[q.peekLast()]) q.removeLast()

        q.addLast(i)
        ++i
    }
    while (i < array.size) {
        println(array[q.peek()])

        while (!q.isEmpty() && q.peek() <= i - k) q.removeFirst()

        while (!q.isEmpty() && array[i] >= array[q.peekLast()]) {
            q.removeLast()
        }


        q.addLast(i)
        ++i


    }
    println(array[q.peek()])

}
