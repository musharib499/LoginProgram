package com.innobles.logicalprogram.dataStructure.Queue.linklist

/**
 * Created by Musharib Ali on 1/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
   var node = ListNode(1)
     node.next = ListNode(2)
     node?.next?.next = ListNode(3)
     node?.next?.next?.next = ListNode(2)
     node?.next?.next?.next?.next = ListNode(4)

    println(isPalindrome(node))
}
class ListNode(var data: Int) { var next: ListNode? = null }
fun isPalindrome(h:ListNode):Boolean{
    var s:ListNode = h
    var node = reverse(h)

    while (node != null && s != null ){
        println(s.data)
        println(node.data)
        if (s.data != node?.data) return false

         s = s?.next!!
         node = node.next
    }
    return true
}
fun reverse(head: ListNode): ListNode? {
    if (head.next == null) return head
    var node = reverse(head.next!!)
    head.next?.next = head
    head.next = null
    return node

}

