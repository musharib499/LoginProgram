package com.app.logicprogram.dataStructure

fun main() {
  val list = getPermutation(listOf(1,2,3))
    println(list)
}


fun getPermutation(parm:List<Int>):List<List<Int>> {

    if (parm.size == 1) return arrayListOf(parm)
    val resultList = mutableListOf<MutableList<Int>>()

    printPermutation(resultList, parm.toMutableList(), 0, parm.size-1)

    return resultList

}

fun printPermutation(result: MutableList<MutableList<Int>>,list: MutableList<Int>, left:Int, right:Int) {
    var newList = list
    if (left == right) {
        val l = mutableListOf<Int>()
        newList.forEach {
            l.add(it)
        }
        result.add(l)
        return

    }
        for (i in left..right) {
            if (i != left) {
                newList = swipe(newList, left, i)
            }
            printPermutation(result, newList, left + 1, right)
            if(i != left) {
                newList = swipe(newList, i, left)
            }

        }
}

fun swipe(list: MutableList<Int>, left:Int, right:Int):MutableList<Int> {
    val t = list[left]
    list[left] = list[right]
    list[right] = t
    return list
}

