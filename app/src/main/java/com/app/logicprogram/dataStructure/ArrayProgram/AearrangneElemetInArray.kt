package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
  val array = arrayOf<Int>(-1, -1, 6, 1, 9, 3, 2, -1, 4, -1)
  println(rearrangeElement(array).contentToString())


    val array1 = arrayOf<Int>(19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
        11, 10, 9, 5, 13, 16, 2, 14, 17, 4)
    println(rearrangeElement(array1).contentToString())
}

private fun rearrangeElement(array: Array<Int>):Array<Int> {

    var hashMap = HashMap<Int,Int>()

    array.forEachIndexed {index, element ->
        hashMap[element] = index
    }

    array.forEachIndexed { index, element ->
        when{
             hashMap.containsKey(index) ->  array[index] = index
             !hashMap.containsKey(index) ->  array[index] = -1
        }
    }

    return array
}