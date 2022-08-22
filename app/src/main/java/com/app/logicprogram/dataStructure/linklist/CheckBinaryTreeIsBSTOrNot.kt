package com.app.logicprogram.dataStructure.linklist

/**
 * Created by Musharib Ali on 2/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    var root = Node(4)
    root.left = Node(2)
    root.right = Node(5)
    root.left?.left = Node(1)
    root.left?.right = Node(3)
    println(checkBST(root, null, null))


}


fun checkBST(root: Node?, left: Node?, right: Node?): Boolean {
    if (root == null) return true

    if (left != null && root.data <= left.data) return false

    if (right != null && root.data >= right.data) return false

    return checkBST(root.left, left, root) && checkBST(root.right, root, right)
}

class Node(data: Int) {
    var data = data
    var left: Node? = null
    var right: Node? = null
}


