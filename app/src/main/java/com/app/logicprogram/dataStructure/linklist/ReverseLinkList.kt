package com.app.logicprogram.dataStructure.linklist

fun main() {
   // input  1,2,3,4,5
    // output 5,4,3,2,1
    // https://www.google.com/search?q=reverse+linked+list+node+animation+code&rlz=1C5CHFA_enIN1027IN1027&sxsrf=AJOqlzU9t9F2bFXj3g7PE_2yBSvYA8Xw3A%3A1678545782339&ei=dpMMZKisFLe7seMPzLa1yAo&oq=Reverse+linklist+node+animation&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgAMgcIIRCgARAKMgcIIRCgARAKOgoIABBHENYEELADOgYIABAWEB46BgghEBUQCjoKCCEQFhAeEB0QCjoMCCEQFhAeEA8QHRAKOgYIIRANEBU6CAghEBYQHhAdOgoIIRAWEB4QDxAdSgQIQRgAUJgCWJkkYP4raAZwAXgAgAHQAYgBlg-SAQYwLjEwLjGYAQCgAQHIAQjAAQE&sclient=gws-wiz-serp#kpvalbx=_EZYMZNvEIvfy4-EP-rChkAc_35

    var node  = LinkListNode(1).pusNode(2).pusNode(3).pusNode(4).pusNode(5)
   var nodePrint:LinkListNode? = node
    while (nodePrint != null) {
        println(nodePrint.`val`)
        nodePrint = nodePrint.next
    }

    var reverse = node.getReverseList()
    while (reverse != null) {
        println(reverse.`val`)
        reverse = reverse.next
    }
}


fun LinkListNode.getReverseList():LinkListNode? {
    var previous:LinkListNode? = null
    var current:LinkListNode? = this
    var next:LinkListNode? = null

    while (current != null) {
        next = current.next
        current.next = previous
        previous = current
        current = next
    }
    return previous
}


