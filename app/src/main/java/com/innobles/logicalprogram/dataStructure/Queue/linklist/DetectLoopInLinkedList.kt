package com.innobles.logicalprogram.dataStructure.Queue.linklist

/**
 * Created by Musharib Ali on 12/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    var head = Node2(1)
    head.next = Node2(3)
    head.next = Node2(4)
    println(detectLoop(head))
}

class Node2(var data: Int, var next: Node2? = null)

fun detectLoop(head: Node2?): Boolean {
    var fast = head
    var slow = head
    while (fast != null && fast.next != null && slow != null) {
        fast = fast.next?.next
        slow = slow.next
        if (fast == slow) return true
    }
    return false
}

