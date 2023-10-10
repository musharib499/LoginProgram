package com.app.logicprogram.dataStructure.ArrayProgram

import java.util.Collections
import java.util.Comparator

fun main() {
    getMergeArray(mutableListOf(Interval(1,3),Interval(2,6),Interval(8,10),Interval(7,11),Interval(4,5),Interval(15,18))).forEach {
        println(it.toString())
    }

//    getMergeArray(mutableListOf(mutableListOf(1,4),mutableListOf(4,5))).forEach {
//        println(it.toString())
//    }
}

data class Interval(var start:Int,var end:Int)


fun getMergeArray(array: MutableList<Interval>) : List<Interval> {
    var  k = 0
    var j = 0
    val comparator = Comparator { p1: Interval, p2: Interval ->
        if (p1.start < p2.start) -1
        else if (p1.start == p2.start) {
            0
        }else {
            1
        }
    }
    array.sortWith(comparator = comparator)
    val resultList = mutableListOf<Interval>()

    array.forEach {
        if (resultList.isEmpty() || resultList.last().end < it.start) {
            resultList.add(it)
        } else {
            resultList.last().end = Math.max(resultList.last().end,it.end)
        }
    }

    return resultList

}