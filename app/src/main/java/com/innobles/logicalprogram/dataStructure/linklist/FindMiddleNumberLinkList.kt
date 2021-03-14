package com.innobles.logicalprogram.dataStructure.linklist

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    middleElementLinkList()
}

fun middleElementLinkList() {
    var link = LinkedList()
    link.node = LinkedList.Node(10)
    link.node?.next = LinkedList.Node(20)
    link.node?.next?.next = LinkedList.Node(30)
    link.node?.next?.next?.next = LinkedList.Node(40)
    link.node?.next?.next?.next?.next = LinkedList.Node(50)

    var first = link.node
    var second = link.node
    while (first != null && first.next != null) {
        println("f ${first.next?.data}")
        println("s ${second?.next?.data}")
        first = first.next?.next
        second = second?.next


    }
    println(second?.data)

}

class LinkedList {
    var node: Node? = null

    class Node(d: Int) {
        var data = d
        var next: Node? = null
    }


}

