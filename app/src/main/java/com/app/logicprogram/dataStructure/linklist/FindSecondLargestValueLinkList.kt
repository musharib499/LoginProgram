package com.app.logicprogram.dataStructure.linklist

fun main() {
    var node = ListNode(12)
    node.next = ListNode(35)
    node.next?.next = ListNode(1)
    node.next?.next?.next = ListNode(10)
    node.next?.next?.next?.next = ListNode(34)
    node.next?.next?.next?.next?.next = ListNode(1)
    // 12 -> 35 -> 1 -> 10 -> 34 -> 1
    println(findSecondLargerValueLinkedList(node))
}

fun findSecondLargerValueLinkedList(node: ListNode?):Int {
    var first = 0
    var second = 0
    var head = node
    while (head != null) {
        var value = head.data
        if (value!! > first) {
            second = first
            first = value
        } else if (value >second && value<first) {
            second = value
        }
        head = head.next
    }
    return second
}