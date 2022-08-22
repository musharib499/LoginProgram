package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 23/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    println(getSegregateZeroAndOne(arrayListOf(0, 1, 0, 1, 0, 0, 1, 1, 1, 0)))
    println(getSegregateZeroAndOneOptimize(arrayListOf(0, 1, 0, 1, 0, 0, 1, 1, 1, 0)))
    println(getSegregateZeroAndOneOptimize(arrayListOf(5, 4, 6, 3, 2, 0, 1, 7, 8, 9)))
}


// Time Complexity: O(n)
//  Space Complexity : O(1)
fun getSegregateZeroAndOneOptimize(a:ArrayList<Int>):ArrayList<Int>{
    var l = 0
    var r = a.size-1

    while (l<r){
        if (a[l]%2 == 0)
        {
            a[r] = a[r] + a[l]
            a[l] = a[r] - a[l]
            a[r] = a[r] - a[l]
            r--
        }else l++
    }

    return a
}


// Time Complexity: O(2n)
  //  Space Complexity : O(1)
fun getSegregateZeroAndOne(a:ArrayList<Int>):ArrayList<Int>{
    var s = 0
    a.forEach {
        s +=it
    }
    for (e in 0..(a.size-1)){
        if (s<=e){
            a[e] = 0
        }else
        {
            a[e] = 1
        }
    }

    return a
}