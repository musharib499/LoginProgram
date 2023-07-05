package com.app.logicprogram.dataStructure.linklist

fun main() {
    var node = ListNodeP(1)
    node.next = ListNodeP(2)
    node.next?.next = ListNodeP(3)
    node.next?.next?.next = ListNodeP(2)
    node.next?.next?.next?.next = ListNodeP(1)
 //println(isPalindrome(node))
 println(getAverages(intArrayOf(40527,53696,10730,66491,62141,83909,78635,18560),2).contentToString())
 println(getAverages(intArrayOf(7,4,3,9,1,8,5,2,6),3).contentToString())
}


class ListNodeP(var `val`: Int) {
    var next: ListNodeP? = null
}
fun isPalindrome(head: ListNodeP?): Boolean {

    var fast = head
    var slow = head

    while(fast != null && fast.next != null) {

        fast = fast?.next?.next
        slow = slow?.next
    }

// reverse linklist second half slow in middle

    var pre : ListNodeP? = null

    while (slow != null) {
        val temp = slow?.next
        slow?.next = pre
        pre = slow
        slow = temp
    }

    var left = head
    var right = pre

    while (right != null && left != null) {
        if(right.`val` != left.`val`) return false

        left = left?.next
        right = right?.next
    }

    return true
}

fun getAverages(nums: IntArray, k: Int): IntArray {
    var newNums = IntArray(nums.size) { -1 }
    if (k == 0) return nums

    val radius = k + nums.size / 2 + if (nums.size%2 == 0) -1 else 0
    var i = 0

    while (i < nums.size - k * 2) {

        var sum = nums[i]
        var j = i + 1
        var r = radius
        while (j < nums.size && r > 1) {
            sum += nums[j]
            r--
            j++
        }

        if (sum > 0 && sum / radius > k) {
            newNums[k + i] = sum / radius
        }
        i++
    }
  // [-1,-1,46717,55393,60381,61947,-1,-1]
    return newNums
}