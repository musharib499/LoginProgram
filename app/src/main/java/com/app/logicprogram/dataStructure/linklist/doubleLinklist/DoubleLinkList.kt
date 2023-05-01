package com.app.logicprogram.dataStructure.linklist.doubleLinklist

//A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.
class DoubleLinkList {
    // Head of list
    var head: Node? = null

    // Doubly Linked list Node h
    class Node(var data: Int) {
        var prev: Node? = null
        var next: Node? = null
    }

    fun push(new_data: Int) {
        val new_Node = Node(new_data)
        new_Node.next = head
        new_Node.prev = null

        if (head != null) {
            head!!.prev = new_Node
        }
        head = new_Node
    }
}