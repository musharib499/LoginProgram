package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.PriorityQueue
import java.util.Queue

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
//    findKthLargest(intArrayOf(3,2,1,5,6,4), 2).apply {
//        println(this)
//    }

    findKthLargest(intArrayOf(3,2,1,1,2,4,5,5,6), 4).apply {
        println(this)
    }

//    findMaxSecondValueLargest(intArrayOf(3,2,1,5,6,4), 2).apply {
//        println(this)
//    }

        topKFrequent(intArrayOf(1,1,1,2,2,3), 2).apply {
        println(this.contentToString())
    }


}

fun findKthLargest(nums: IntArray, k: Int): Int {
    val queue = PriorityQueue<Int>()


    nums.forEach {
        if (queue.size<k) {
            queue.add(it)
        }else {
            if (it>=queue.peek()) {
                queue.add(it)
                queue.remove()
            }
        }
    }

   return queue.peek()


}


fun findMaxSecondValueLargest(nums: IntArray, k: Int): Int {
    val queue = PriorityQueue<Int>()

    nums.forEach {
        if (queue.size<k) {
            queue.add(it)
        }else {
            if (it>=queue.peek()) {
                queue.add(it)
                queue.remove()
            }
        }
    }

    return queue.peek()


}

@RequiresApi(Build.VERSION_CODES.N)
fun topKFrequent(nums: IntArray, k: Int): IntArray {

    var hashMap = HashMap<Int,Int>()

    nums.forEach {
        hashMap.merge(it,1) { old, n -> old+n}
    }

    val queue = PriorityQueue<Pair<Int,Int>>( compareBy{ -it.second } )
    hashMap.forEach{ (num, counter) ->
        queue.add(num to counter)
    }

    val result = IntArray(k)
    for (i in 0 until k) {
        result[i] = queue.poll().first
    }

    return result



}