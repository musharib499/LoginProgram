package com.app.logicprogram.dataStructure.tree

fun main() {

    var node = TreeNodeWithParent(20)
    node.left = TreeNodeWithParent(8)
    node.left?.parent = node
    node.right = TreeNodeWithParent(22)
    node.right?.parent = node

    node.left?.left = TreeNodeWithParent(4)
    node.left?.left?.parent = node.left
    node.left?.right = TreeNodeWithParent(12)
    node.left?.right?.parent = node.left


    node.left?.right?.left = TreeNodeWithParent(10)
    node.left?.right?.left?.parent =  node.left?.right
    node.left?.right?.right = TreeNodeWithParent(14)
    node.left?.right?.right?.parent =  node.left?.right

    var n1 =  node.left?.left
    var n2 =  node.left?.right?.left
    var output = findLCAWithParentPointer(n1,n2)
    println(output?.`val`)


}
class TreeNodeWithParent(var `val`: Int = 0) {
    var left: TreeNodeWithParent? = null
    var right: TreeNodeWithParent? = null
    var parent: TreeNodeWithParent? = null
}
fun findLCAWithParentPointer(n1:TreeNodeWithParent?, n2:TreeNodeWithParent?):TreeNodeWithParent?{

    val hashMap = HashMap<TreeNodeWithParent,Boolean>()
    var node1 = n1
    var node2 = n2

    while (node1!= null) {
        hashMap[node1] = true
        node1 = node1.parent
    }


    while (node2!= null) {
        if (hashMap.contains(node2)) return node2
        node2 = node2.parent
    }

    return null
}




