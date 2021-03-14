package com.innobles.logicalprogram.dataStructure.linklist

/**
 * Created by Musharib Ali on 11/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    var n = Node1(10)
    n.left = Node1(2)
    n.right = Node1(10)
    n.right!!.right = Node1(-25)
    n.right!!.right?.left = Node1(3)
    n.right!!.right?.right = Node1(4)
    n.right = Node1(10)
    n.left!!.left = Node1(20)
    n.left!!.right = Node1(1)
    println(checkMaxSum(n, 0))
}

class Node1(data: Int) {
    var data = data
    var left: Node1? = null
    var right: Node1? = null
}


fun checkMaxSum(root: Node1?, sum: Int): Int {
    var s = sum
    if (root == null) return 0
    var left = Math.max(0, checkMaxSum(root.left, s))
    var right = Math.max(0, checkMaxSum(root.right, s))
    s = Math.max(left + right + root.data, s)
    return Math.max(s, Math.max(left, right) + root.data)
    // return checkMaxSum(root.right,root,right,if (left.data>left.data) s+left.data +root.data else s) +checkMaxSum(root.left,left,root,if (right.data>left.data) s+right.data +root.data else s)

}


//fun checkMaxSum(root:Node1?):Int{
//   var left =
//}

