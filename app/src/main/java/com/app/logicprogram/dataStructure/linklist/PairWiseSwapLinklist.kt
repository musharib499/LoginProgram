package com.app.logicprogram.dataStructure.linklist

/**
 * Created by Musharib Ali on 14/3/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    var node = ListNode(1)
    node.next = ListNode(2)
    node.next?.next = ListNode(3)
    node.next?.next?.next = ListNode(2)
    node.next?.next?.next?.next = ListNode(4)
    var out: ListNode? = pairWiseSwap(node)
    while (out != null) {
        println(out.data)
        out = out.next
    }
}

fun pairWiseSwap(node: ListNode?): ListNode? {
    var head = node
    while (head != null && head.next != null) {
        var temp = head.data
        head.data = head.next?.data ?: 0
        head.next?.data = temp
        // increase point two time means fast node
        head = head.next?.next
    }
    return node
}
