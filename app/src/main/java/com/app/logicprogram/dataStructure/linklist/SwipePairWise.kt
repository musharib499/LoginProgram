package com.app.logicprogram.dataStructure.linklist

fun main() {
    val node = ListNode(1)
    node.next = ListNode(2)
    node.next?.next = ListNode(3)
    node.next?.next?.next = ListNode(4)
  var n =  swapPairs(node)
  while (n != null) {
      println(n.data)
      n = n.next
  }
}

fun swapPairs(head: ListNode?): ListNode? {
    var h = head

    while(h?.next != null) {
        val temp = h?.data
        h?.data = h?.next?.data ?: 0
        h?.next?.data = temp
        h = h?.next?.next

    }

    return head
}