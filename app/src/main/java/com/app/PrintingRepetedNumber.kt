package com.app

//fun main() {
//    getArray(intArrayOf(3,3, 3, 8, 8, 8, 8, 9, 3, 1, 1)).apply {
//        println(this)
//    }
//}

import java.util.*

fun main(args: Array<String>) {
    readln().toInt()
    val petals = readln().split(" ").map {it.toLong()}
    val maxSum = calculate(petals)
    println(maxSum)
}

fun calculate(petals:List<Long>):Long {
    var total = petals.sum()
    if(total % 2 != 0L) {
        return total
    }

    val midOdd = petals.filter { it % 2 == 0L }.minOrNull() ?: return  -1

    return total - midOdd
}

fun getArray(intArray: IntArray):String {

    var i = 0
    var count = 0
    var result:String = ""
    var start = intArray[0]

    while (i<intArray.size) {
        if (intArray[i] == start) { // 3, 3, 3, 8,8,8,8
            count++
        } else {
            val number = if (count>0) start else intArray[i]
            result += "$count${number}"
            count = 1 // 8
            start = intArray[i]
        }
        i++

    }

    if(count > 0) result += "$count${intArray[intArray.size-1]}" else result

    return result

}

//3,3, 3, 8, 8, 8, 8, 9, 3, 1, 1







// [17:56] Sumeet S
//3,3, 3, 8, 8, 8, 8, 9, 3, 1, 1
//[17:57] Sumeet S
//3348191321