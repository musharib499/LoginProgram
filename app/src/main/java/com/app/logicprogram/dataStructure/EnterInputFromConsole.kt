package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 15/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    //fun readInts() = readLine()!!.split(' ').map { it.toInt() }
    //  println(readInts())

    var c = readln().toInt()
    var n = readln().toInt()
    var k = readln()
    var arr = arrayListOf<Int>()
    for (k in 1..n) {

        arr.add(readln().toInt())
    }
    println(arr.toString())
}