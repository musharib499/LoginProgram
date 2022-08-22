package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 15/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    //fun readInts() = readLine()!!.split(' ').map { it.toInt() }
    //  println(readInts())

    var c = readLine()!!.toInt()
    var n = readLine()!!.toInt()
    var k = readLine()!!
    var arr = arrayListOf<Int>()
    for (k in 1..n) {

        arr.add(readLine()!!.toInt())
    }
    println(arr.toString())
}