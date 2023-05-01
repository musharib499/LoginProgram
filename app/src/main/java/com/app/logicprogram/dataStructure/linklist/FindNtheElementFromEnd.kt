package com.app.logicprogram.dataStructure.linklist

/**
 * Created by Musharib Ali on 29/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {


    var myLinked = MyLinked()
      myLinked.push(12)
      myLinked.push(13)
      myLinked.push(14)
      myLinked.push(16)
      myLinked.push(17)
      myLinked.push(11)

   //  println(nthNodeFromEnd(myLinked, 4))
     var node  = deleteN(myLinked.head, 4)
     while (node != null) {
         println(node.data)
         node =node.next
     }


}


fun nthNodeFromEnd(myLinked: MyLinked, n: Int):Int{
    var l = 0
    var temp = myLinked.head
    while (temp != null){
          temp = temp.next
        l++
    }


    if (l<n) return -1
    var p = n-1
    var nthNode = myLinked.head
    while (p > 0 ){
        nthNode = nthNode?.next
        p--
    }
    return nthNode?.data?:-1
}


fun deleteNthNode(myLinked: MyLinked, n: Int) {
    var temp = myLinked.head
    while (temp?.next != null) {
          println(temp.data)
          myLinked.head?.next
          temp = temp.next
    }

}

fun deleteN(head: MyLinked.Node?, position: Int): MyLinked.Node? {
    var head = head
    var temp: MyLinked.Node? = head // Create a temporary node pointing to the head of the linked list
    var prev: MyLinked.Node? = head // Create a previous node pointing to the head of the linked list
    for (i in 0 until position) { // Loop through the linked list to find the node at the given position
        if (i == 0 && position == 1) { // If the node to delete is the head
            head = head?.next // Set the next node as the new head
        } else {
            if (i == position - 1 && temp != null) { // If the node to delete is found
                prev?.next = temp.next // Set the next node of the previous node to be the next node of the current node
            } else {
                prev = temp // Move the previous node to the current node

                // If the previous node is null, the position was greater than the number of nodes in the list
                if (prev == null) break
                temp = temp?.next // Move the temporary node to the next node
            }
        }
    }
    return head // Return the new head of the linked list
}







class MyLinked {


    var head :Node? = null

     class Node(var data: Int,var next:Node? = null)

    fun push(new_data: Int) {
        val new_node = Node(new_data)
        new_node.next = head
        head = new_node
    }

}