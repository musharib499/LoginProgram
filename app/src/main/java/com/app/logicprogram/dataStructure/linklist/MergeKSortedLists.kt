package com.app.logicprogram.dataStructure.linklist

fun main() {

    //[[1,4,5],[1,3,4],[2,6]]
    val node1 = ListNode(1)
    node1.next = ListNode(4)
    node1.next?.next = ListNode(5)

    val node2 = ListNode(1)
    node2.next = ListNode(3)
    node2.next?.next = ListNode(4)

    val node3 = ListNode(2)
    node3.next = ListNode(6)

//  println(mergeKLists(arrayOf(node1,node2,node3)))
  var node = mergerKLinkList(arrayOf(node1,node2,node3))
    while (node!= null) {
        println(node.data)
        node = node.next
    }
}


// O(nLogK)

fun mergerKLinkList(lists: Array<ListNode?>): ListNode? {
    var dummy: ListNode? = null
    var i = 0
    while(i<lists.size) {
        dummy = mergerTwoLinkList(dummy, lists[i])
        i++
    }
    return dummy
}

fun mergerTwoLinkList(listNode1: ListNode?,listNode2: ListNode?):ListNode?{
     if(listNode1 == null) return listNode2
     if(listNode2 == null) return listNode1
     var node1  = listNode1
     var node2  = listNode2
    var dummy:ListNode? = null
    if(node1.data!! < node2.data!! ) {
        dummy = ListNode(node1.data!!)
        node1 = node1.next
    }else {
        dummy = ListNode(node2.data!!)
        node2 = node2.next
    }
    var tail = dummy

    while (node2 != null && node1 != null) {
        if(node1.data!! < node2.data!! ) {
            tail?.next = node1
            node1 = node1.next
        }else {
            tail?.next = node2
            node2 = node2.next
        }
        tail = tail?.next
    }

    if(node1 != null) {
        tail?.next = node1
    } else if (node2 != null) {
        tail?.next = node2
    }

    return dummy
}




// O(n*k)
fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    var list = mutableListOf<Int>()

    lists.forEach {
        var head = it
        while(head != null) {
            list.add(head?.data?:0)
            head = head?.next
        }
    }
    list.sort()

    var node : ListNode? = null
    var i = list.size-1
    while (i>=0){
        var t = node
        node = ListNode(list[i])
        node?.next = t
        i--
    }
    return node

}

