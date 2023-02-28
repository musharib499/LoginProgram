package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
  println(findOnceNumberFromArray(arrayOf(2, 3, 5, 4, 5, 3, 4)).toString())
}
private fun findOnceNumberFromArray(array: Array<Int>) :ArrayList<Int>{
    val hashMap = HashMap<Int,Boolean>()
    val a = ArrayList<Int>()
    array.forEach {
        hashMap[it] = hashMap.containsKey(it)
    }

    hashMap.mapKeys {
        if (!it.value) {
            a.add(it.key)
        }
    }


    return a

}