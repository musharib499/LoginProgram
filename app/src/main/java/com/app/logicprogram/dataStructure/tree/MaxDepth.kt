package com.app.logicprogram.dataStructure.tree

import java.util.Stack

fun main() {
   var root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)
 println(maxDepth(root))
 println(maxDepthStack(root))
}

fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0

    if(root.left == null && root.right == null) return 1

    if(root.left == null) return 1 + minDepth(root.right)
    if(root.right == null) return 1 + minDepth(root.left)

    return 1 + maxOf(minDepth(root.left),minDepth(root.right))

}

// Best solution with stack
fun maxDepthStack(root: TreeNode?): Int {
    if(root == null) return 0
    var level = 0
    val stack = Stack<Pair<TreeNode?,Int>>()
    stack.push(Pair(root,1))

    while (stack.isNotEmpty()) {
        val value = stack.peek()
        stack.pop()

        if (value.first != null) {
            level =  maxOf(level,value.second)
            stack.push(Pair(value.first?.left,value.second+1))
            stack.push(Pair(value.first?.right,value.second+1))

        }
    }

    return level

}