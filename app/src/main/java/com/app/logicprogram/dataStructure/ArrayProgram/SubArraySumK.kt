package com.app.logicprogram.dataStructure.ArrayProgram

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
   // println(subarraySum(intArrayOf(1, 2, 3), 3))

    var aa:String? = null
    var value:Hello? = Hello("Hello")
    val kotlin = (value as? Hello)?.st
    println(kotlin)
     runBlocking {
         var task  = GlobalScope.launch {
             delay(100)
             println("HELLO")
         }
         task.join()
         println("BYE")
     }

}
data class Hello(var st:String? = null)
data class Bye(var st:String? = null)

fun subarraySum(nums: IntArray, k: Int): Int {

    var currentSum = 0
    var count = 0
    var hashMap = HashMap<Int, Int>()
    var j = 0
   while (j < nums.size) {
        currentSum += nums[j]
        if ( currentSum == k) {
            count++
        }

        if(hashMap.containsKey(currentSum-k)) {
            count += hashMap[currentSum-k]!!
        }

        if (hashMap.containsKey(currentSum)) {
            hashMap[currentSum] = hashMap[currentSum]!! +1
        }
        else  {
                hashMap[currentSum] = 1
            }
       j++

    }

    return count

}

