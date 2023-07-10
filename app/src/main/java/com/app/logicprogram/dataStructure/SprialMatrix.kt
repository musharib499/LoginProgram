package com.app.logicprogram.dataStructure

fun main() {
    println(spiralMatrixOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))))
}

fun spiralMatrixOrder(matrix: Array<IntArray>): List<Int> {

    var left = 0
    var right  = matrix[0].size -1
    var top = 0
    var bottom = matrix.size -1
    var newArray = mutableListOf<Int>()
    while(left <= right && top <= bottom){

        for (i in left..right) {
            newArray.add(matrix[top][i])
        }
        top +=1

        for (i in  top..bottom) {
            newArray.add(matrix[i][right-1])
        }
        right -=1


        if(left > right && top > bottom) break

        for (i in  right downTo left) {
            newArray.add(matrix[bottom][i])
        }
        bottom -=1

        for (i in  bottom downTo top) {
            newArray.add(matrix[i][left])
        }
        left +=1


    }
    return newArray


}