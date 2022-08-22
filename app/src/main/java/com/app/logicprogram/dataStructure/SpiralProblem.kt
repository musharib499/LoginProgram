package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 05/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
  //  println(spiralOrder(arrayOf(intArrayOf(2,5), intArrayOf(8, 4), intArrayOf(0,-1))))
    var value = generateMatrix(3)
    for (row in value) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
    //print(generateMatrix(3).toString())
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val item = mutableListOf<Int>()
    if (matrix.isEmpty()) return item
    if (matrix.isNotEmpty()) {
        if (matrix[0].isEmpty()) return item
    }
    var n = matrix.size
    var m = matrix[0].size
    var j: Int = 0
    var l: Int = 0
    while (j < m && l < n) {
        for (i in j..m - 1) {
            item.add(matrix[j][i])
        }
        j += 1


        for (i in j..n - 1) {
            item.add(matrix[i][m - 1])
        }
        n -= 1
        m -= 1

        if (l < n) {
            for (i in m - 1 downTo l) {
                item.add(matrix[n][i])
            }
        }

       if (j <= m) {
           for (i in n - 1 downTo j) {
               item.add(matrix[i][l])
               println("mm" + matrix[i][l])
           }
       }
        l +=1


    }
    return item


}



fun generateMatrix(n: Int): Array<IntArray> {
    val list = Array(3){IntArray(3)}

    var m = n
    var q = n
    var k = 1
    var j = 0
    var l = 0
    while(j< m && l<q){
        for(i in j..m-1){
            list[j][i] = k
            println(list[j][i])
            k++
        }
        j++

        for(i in j..q-1){
            list[i][m-1] = k
            k++
        }
        m--
        q--

        if (l < n) {
            for (i in m - 1 downTo l) {
                list[q][i] = k
                k++
            }
        }


        if (j<=m) {
            for (i in n - 2 downTo j) {
                list[i][l] = k
                k++
            }

        }
        l++



    }

    return list
}



