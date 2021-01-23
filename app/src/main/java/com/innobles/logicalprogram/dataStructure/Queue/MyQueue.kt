package com.innobles.logicalprogram.dataStructure.Queue

import java.util.*

/**
 * Created by Musharib Ali on 11/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    // linkListQueue()
    priorityQueue()
}

fun linkListQueue() {
    var q = LinkedList<String>()
//    q.add("Musharib")
//    q.add("Chand")
//    q.add("Sarfarz")
//    q.add("Shadab")
//    q.add("Intekhab")
//    q.add("Mujahid")

    q.forEach {
        println(it)
    }
    println()
//    q.remove()
    println(q.toString())
    println(q.poll()) //retrun null if queue if empety // print first element
    println(q.peek()) //

}

fun priorityQueue() {
    var p = PriorityQueue<String>()

    p.add("Hello")
    p.add("bye")
    p.add("hi jb b ")
    p.add("Welcome jnbjb  bjhbj bnjb")
    p.add("new gvg vgv gvg")
    p.add("old  hgv")
    p.add("oldest hgvghcv")
    while (p.size != 0) {
        println(p.poll())
    }

}

class MyComparator : Comparator<String> {
    override fun compare(o1: String?, o2: String?): Int {
        return o1?.length ?: 0 - o2?.length!!
    }

}

