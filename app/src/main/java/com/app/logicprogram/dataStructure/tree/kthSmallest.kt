package com.app.logicprogram.dataStructure.tree

import java.util.TreeSet

fun main() {
  var root = TreeNode(3)
     root.left = TreeNode(1)
    root.right = TreeNode(4)
    root?.left?.right = TreeNode(2)
  //  println(kthSmallest(root,1))

    println(findSecondMinimumValue(root))
}

fun kthSmallest(root: TreeNode?, k: Int): Int {
    var list = mutableListOf<Int>()
    triverse(root, list,k)
    return list[k-1]
}


private fun triverse(node:TreeNode?, list:MutableList<Int>,k: Int) {
    if(node == null || list.size > k) return
    triverse(node?.left, list,k)
    list.add(node.`val`)
    triverse(node?.right, list,k)

    var tree = TreeSet<Int>()
    tree.pollFirst()
}

fun findSecondMinimumValue(root: TreeNode?): Int {
    val list = TreeSet<Int>()
    triverse(root,list)

    list.pollFirst()
    return if (list.firstOrNull() != null) list.first()  else -1
}


private fun triverse(node:TreeNode?, list:TreeSet<Int>) {

    if(node == null || list.size>2) return
    triverse(node?.left,list)
    list.add(node.`val`)
    triverse(node?.right,list)

}