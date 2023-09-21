package com.app.logicprogram.dataStructure

fun main(array: Array<String>) {
    println("Please enter number")
    val case = readln().toInt()
    repeat(case) {
        val n = readln().toInt()
        val list = readln().split(" ").map { it.toInt() }
        println(printFavouriteSong(n,list))
    }
}

fun printFavouriteSong(n :Int, list:List<Int>?):Int {
    if(list == null) return -1
    var hash = HashMap<Int,Int>()
    list.forEach {
        if(hash.contains(it)) {
            hash[it] = hash.getValue(it) + 1
        }else {
            hash[it] = 1
        }
    }

    var maxValue = 0
    var k = 0
    for((key, value) in hash) {
        if(value>=maxValue) {
            if(maxValue == value && k>key) k  else k = key
             maxValue = value
        }
    }
    return k

}

fun printDiffAliceAndBobCandle(n:Int,list: List<Int>?,k:Int) {}
