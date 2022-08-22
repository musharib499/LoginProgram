package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 23/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    println(findSecondLargeValue(arrayListOf(12, 35, 1, 10, 34, 1)))
}

fun findSecondLargeValue(ar:ArrayList<Int>):Int{
    var first = 0
    var second = 0
    if (ar.size == 0) return 0
    ar.forEach {
        println("$first , $it")
        if (first < it){
        //    println(it
            second = first
            first = it
        } else if(second<it && it != first){
            second = it
        }
    }

    return  second
}



