package com.app.logicprogram.dataStructure.linklist

fun main() {
// [1,2,3,4,5] n = 2 remover from end
    var node = ListNode(1)
    node?.next = ListNode(2)
    node?.next?.next = ListNode(3)
    node?.next?.next?.next = ListNode(4)
    node?.next?.next?.next?.next = ListNode(5)
    var outNode = removeNthFromEnd(node, 4)
    while (outNode != null) {
        println(outNode.data)
        outNode = outNode.next
    }

}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

    var head:ListNode? = head ?: return null
    var count = 0
    var t:ListNode? = head
    while (t != null) {
        t = t.next
        count++
    }

    if (count<n) return null
    var reminder = count - n + 1

    var prev: ListNode? = null
    var temp: ListNode? = head

    for (i in 0..count) {
        if (i == 0 && reminder == 1 ) {
            head = temp?.next
        }
        if (i == reminder-1) {
            prev?.next = temp?.next
            return head
        }
        prev = temp
        temp = temp?.next

    }
    return head

}

