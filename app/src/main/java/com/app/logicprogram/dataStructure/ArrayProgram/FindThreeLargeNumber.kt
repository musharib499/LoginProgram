package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
   var array = arrayOf<Int>(10, 4, 3, 50, 23, 90)
    findLargeThreeNumber(array)
}

private fun findLargeThreeNumber(array: Array<Int>) {
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    var third = Int.MIN_VALUE
    var fourth = Int.MIN_VALUE
    array.forEach { element ->
        when {
            element > first -> {
                fourth = third
                third = second
                second = first
                first = element
            }
            element > second && element != first -> {
                third = second
                second = element
            }
            element > third && element != second -> {
                fourth = third
                third = element
            }
            element > fourth && element != third -> {
                fourth = element
            }
        }
    }
    println("$first, $second, $third, $fourth")
}
