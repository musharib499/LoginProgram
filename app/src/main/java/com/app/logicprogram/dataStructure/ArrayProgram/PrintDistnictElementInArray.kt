package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
  println(printDistinctElement(arrayListOf(12,10,12,5,6,7,7,1)))
}

private fun printDistinctElement(array: ArrayList<Int>){
  val hashMap = HashMap<Int,Boolean>()
    val a = ArrayList<Int>()

    array.forEachIndexed { i, e ->

        if (!hashMap.containsKey(e)) {
            hashMap[e] = false
            a.add(e)
        }

    }
   println(a.toString())
}