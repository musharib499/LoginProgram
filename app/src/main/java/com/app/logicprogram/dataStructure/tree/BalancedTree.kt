package com.app.logicprogram.dataStructure.tree

fun main() {
    var root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)
    println(isBalanced(root))
}


fun isBalanced(root: TreeNode?): Boolean {
    var maxDiff = 0
    fun height(root:TreeNode?):Int {
        if(root == null) return -1
        var left = height(root.left)
        var right = height(root.right)
        maxDiff = maxOf(maxDiff, Math.abs(left-right))
        return 1+ maxOf(left, right)
    }
    return Math.abs(height(root?.left) - height(root?.right)) <=1 && maxDiff<=1

}


