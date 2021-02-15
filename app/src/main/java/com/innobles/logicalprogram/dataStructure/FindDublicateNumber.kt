
package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
//How do you find duplicate numbers in an array if it contains multiple duplicates? (solution)
fun main() {
    // println(findDuplicateNumber(arrayListOf(1, 2, 4, 4, 5)))
    // println(findMultipleDuplicateNumber(arrayListOf(1, 2, 4, 4, 5, 7, 8, 9, 8)))

    // println(removeDuplicateNumber(arrayListOf(1, 2, 4, 4, 5, 7, 8, 9, 8)))
    //findDuplicate(intArrayOf(1, 3, 4, 7, 2, 7, 8, 7, 8))
    //findDuplicateSet(intArrayOf(1, 3, 4, 7, 2, 7, 8, 7, 8))
    println(printArray(arrayListOf(1, -3, 4, 5, 3, -1, 5)))
}

// Best solution  time complicity O(n) space complicity O(1) valid less 10 digit
fun findDuplicate(nums:IntArray){
    for(i in nums.indices){


        nums[nums[i] % nums.size] =  nums[nums[i] % nums.size] + nums.size
    }
    println(nums.contentToString())
    for(i in nums.indices){
        if(nums[i]>= nums.size*2) {
            println(i)
            break
        }

    }
}

fun findDuplicateSet(nums: IntArray) {
    var s = HashSet<Int>()

    for (i in nums.indices) {
        if (s.contains(nums[i])) println(nums[i]) else s.add(nums[i])

    }
}


fun printArray(arr: ArrayList<Int>): String {

    var h: HashMap<Int, Int> = HashMap()
    var string = ""

    for (i in 0..arr.size - 1) {
        val v = Math.abs(arr[i])
        if (h.containsKey(v)) {
            if (arr[i] != h.get(v)) {
                string += " ${arr[i]},${h.get(v)}"
            }

        } else {
            h.put(v, arr[i])
        }
    }


    return string


}


// For single duplicate number
fun findDuplicateNumber(a: ArrayList<Int>): Int {
    var n = a.size - 1
    var i = 0
    val h = HashMap<Int, Int>()
    while (i < n) {
        if (!h.containsKey(a[i])) {
            h.put(a[i], 1)
        } else {
            return a[i]
        }
        i++
    }
    return -1
}


fun findMultipleDuplicateNumber(a: ArrayList<Int>): String {
    var i = 0
    val h = HashMap<Int, Int>()
    var value = ""
    while (i < a.size) {
        if (!h.containsKey(a[i])) h.put(a[i], 1) else value += "${a[i]},"

        i++
    }
    return value
}

//How are duplicates removed from a given array in Java? (solution)

fun removeDuplicateNumber(a: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    val h = HashMap<Int, Int>()
    while (i < a.size) {
        if (!h.containsKey(a[i])) h.put(a[i], 1) else a.remove(a[i])

        i++
    }
    return a
}




