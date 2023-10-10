package com.app.logicprogram.dataStructure.linklist

fun main() {
    val node1 = ListNode(1)
    node1.next = ListNode(4)
    node1.next?.next = ListNode(5)

    val node2 = ListNode(1)
    node2.next = ListNode(3)
    node2.next?.next = ListNode(4)
    var node = mergeTwoLinkList(node1,node2)
    while (node!= null) {
        println(node.data)
        node = node.next!!
    }
}

fun mergeTwoLinkList(node1 : ListNode?, node2: ListNode?): ListNode {
    var n1 = node1
    var n2 = node2
    var dummyNode:ListNode? = null
    if (n1?.data!! < n2?.data!!) {
        dummyNode = ListNode(n1.data)
        n1 = n1.next
    } else  {
        dummyNode = ListNode(n2.data)
        n2 = n2.next
    }
    var tail = dummyNode
    while (n1!= null && n2 != null) {
         if(n1.data!! < n2.data!!) {
             tail?.next = n1
             n1 = n1.next
         }else {
             tail?.next = n2
             n2 = n2.next
         }
        tail = tail?.next!!
    }

    if(n1 != null) {
        tail?.next = n1
    } else if (n2 != null) {
        tail?.next = n2
    }

  return dummyNode
}

