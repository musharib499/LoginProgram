package com.innobles.logicalprogram.dataStructure.Queue.linklist

/**
 * Created by Musharib Ali on 29/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {


    var myLinked = MyLinked()
      myLinked.push(12)
      myLinked.push(13)
      myLinked.push(14)
      myLinked.push(16)
      myLinked.push(17)
      myLinked.push(11)

     println(nthNodeFromEnd(myLinked, 2))


}


fun nthNodeFromEnd(myLinked: MyLinked, n: Int):Int{
    var l = 0
    var temp = myLinked.head
    while (temp != null){
          temp = temp.next
        l++
    }

    return if (l>n){
        var p = n-1
        var nthNode = myLinked.head
        while (p > 0 ){
            nthNode = nthNode?.next
            p--
        }
        nthNode?.data?:-1

    }else -1

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