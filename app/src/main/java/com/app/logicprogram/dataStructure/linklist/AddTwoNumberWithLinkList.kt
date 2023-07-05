package com.app.logicprogram.dataStructure.linklist

fun main() {
    var node1 = LinkListNode(2).pusNode(4).pusNode(9)
    var node2 = LinkListNode(5).pusNode(6).pusNode(4).pusNode(9)


    var node = addTwoNumbers(node1, node2)
    println(node)
    while (node != null) {
        println(node.`val`)
        node = node.next
    }


}

class LinkListNode(var `val`: Int) {
    var next: LinkListNode? = null
}

fun addTwoNumbers(l1: LinkListNode?, l2: LinkListNode?): LinkListNode? {
    /// 2,4,9 -> 9,4,2
    // 5,6,4,9 -> 9,4,6,5
    var head: LinkListNode? = null
    var list1 = l1
    var list2 = l2
    var carry = 0
    while (list1 != null || list2 != null || carry > 0) {
        var v1 = list1?.`val` ?: 0
        var v2 = list2?.`val` ?: 0
        println("$v1,$v2")
        var sum = v1 + v2 + carry
        //println(sum)
        carry = sum / 10
        // println(carry)
        sum %= 10

        var n = LinkListNode(sum)
        n.next = head
        head = n


        list1 = list1?.next
        list2 = list2?.next
        println(sum)

    }
    return head

}

fun LinkListNode.pusNode(number: Int): LinkListNode {
    val node = LinkListNode(number)
    node.next = this
    return node
}

fun LinkListNode?.getCount(): Int {
    var node = this
    var count = 0
    while (node != null) {
        count += 1
        node = node.next
    }
    return count
}


fun LinkListNode.reverseLinkList(): LinkListNode? {
    var previous: LinkListNode? = null
    var current: LinkListNode? = this
    var next: LinkListNode?
    while (current != null) {
        next = current.next
        current.next = previous
        previous = current
        current = next
    }
    return previous
}
