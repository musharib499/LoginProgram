package com.app.logicprogram.dataStructure.ArrayProgram


fun main() {
println(segregateEvenAndOddNumber(arrayOf(1,9,5,3,2,6,7,11))?.contentToString())
}

private fun segregateEvenAndOddNumber(array: Array<Int>?):Array<Int>? {
    var count = 0
    array?.forEachIndexed { index, element ->
        if (element%2 == 0) {
            val temp = array[count]
            array[count] = element
            array[index] = temp
            count++

        }
    }
   return array
}