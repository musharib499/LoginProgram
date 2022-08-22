package com.app.logicprogram.dataStructure

import java.util.*

/**
 * Created by Musharib Ali on 1/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    val arr = arrayOf(Interval(6, 8), Interval(1, 9), Interval(2, 4), Interval(4, 7))
    mergeIntervals(arr)
}

fun mergeIntervals(arr: Array<Interval>) {
    // Test if the given set has at least one interval
    if (arr.size <= 0) return

    // Create an empty stack of intervals
    val stack: Stack<Interval> = Stack()

    // sort the intervals in increasing order of start time
    arr.sortWith({ o1, o2 -> o1.start - o2.start })

    // push the first interval to stack
    stack.push(arr[0])

    // Start from the next interval and merge if necessary
    for (i in 1 until arr.size) {
        // get interval from stack top
        val top: Interval = stack.peek()

        // if current interval is not overlapping with stack top,
        // push it to the stack
        if (top.end < arr[i].start)
            stack.push(arr[i])
        else if (top.end < arr[i].end) {
            top.end = arr[i].end
            stack.pop()
            stack.push(top)
        }
    }

    // Print contents of stack
    print("The Merged Intervals are: ")
    while (!stack.isEmpty()) {
        val t: Interval = stack.pop()
        print("[" + t.start + "," + t.end + "] ")
    }
}

open class Interval(start: Int, end: Int) {
    var start: Int
    var end: Int

    init {
        this.start = start
        this.end = end
    }
}