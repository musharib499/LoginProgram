package com.app.logicprogram.dataStructure

fun main() {
    println(noAdjacentOnes(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
}
fun noAdjacentOnes(matrix: Array<IntArray>): Boolean {
    val rows = matrix.size
    val cols = matrix[0].size
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (matrix[i][j] == 1) {
                if (i > 0 && matrix[i-1][j] == 1) return false // Check above element
                if (i < rows-1 && matrix[i+1][j] == 1) return false // Check below element
                if (j > 0 && matrix[i][j-1] == 1) return false // Check left element
                if (j < cols-1 && matrix[i][j+1] == 1) return false // Check right element
            }
        }
    }
    return true
}