package com.app.logicprogram.dataStructure.ArrayProgram

fun main(args: Array<String>) {
   getArray().forEach {
       print("$it,")
   }
}


fun getArray() : Array<Int> {
    val arCount = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()



   return ar
}