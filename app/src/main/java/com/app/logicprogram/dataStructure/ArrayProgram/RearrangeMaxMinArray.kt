package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
   println(arrangeMaxMinArray(arrayOf(1, 2, 3, 4, 5, 6, 7)).contentToString())
}

private fun arrangeMaxMinArray(array: Array<Int>):Array<Int> {

    var small = 0
    var large = array.size-1
    val tempArray = array.clone()
    var flag = true
    array.forEachIndexed { index, i ->
        if (flag) {
            array[index] = tempArray[large--]
        }else{
            array[index] = tempArray[small++]
        }
        flag = !flag
    }
  return array

}