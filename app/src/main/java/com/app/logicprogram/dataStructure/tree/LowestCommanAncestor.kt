package com.app.logicprogram.dataStructure.tree

fun main() {
    var node = TreeNode(1)
    node.left = TreeNode(2)
    node.right = TreeNode(3)

    node.left?.left = TreeNode(4)
    node.left?.right = TreeNode(5)

    node.right?.left = TreeNode(6)
    node.right?.right = TreeNode(7)

 var treeNode = lowestCommonAncestor(node , TreeNode(5), TreeNode(6))
    println(treeNode?.`val`)
}
  class TreeNode(var `val`: Int = 0) {
      var left: TreeNode? = null
      var right: TreeNode? = null
  }
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        var listP = mutableListOf<TreeNode>()
        var listQ = mutableListOf<TreeNode>()

        if(root == null || (root.left == null && root.right == null )) return null

        var left = findPath(root, p ,listP)
        var right = findPath(root, q ,listQ)
        if(!left || !right) return null

        var j  = 0
        while(j< listP.size && j< listQ.size) {
            if(listP[j] != listQ[j]){
                break
            }
            j++
        }
        if (j == 0) return null
        return listP[j-1]


    }


    fun findPath(root: TreeNode?, n: TreeNode?, list:MutableList<TreeNode>): Boolean {

        if(root == null) return false

        list.add(root)

        if(root.`val` == n?.`val` || findPath(root.left, n, list) || findPath(root.right, n, list)) {

            return true
        }

        list.removeAt(list.size - 1)
        return false
    }
