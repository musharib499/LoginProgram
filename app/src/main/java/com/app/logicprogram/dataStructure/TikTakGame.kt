package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 10/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    print(getPositionWin(arrayOf("X", "O", "-", "<>", "-", "O", "-", "<>", "O", "X", "-")))
    // print(getPositionWin(arrayOf("X","-","O","<>","-","-","O","<>","-","-","X")))
    //print(getPositionWin(arrayOf("X","O","X","<>","-","O","O","<>","X","X","O")))
    /*X - 0
    * - - 0
    * - - X
    * */

}

fun getPositionWin(a: Array<String>): String {
    var i = 0
    var x = arrayListOf<Int>()
    var o = arrayListOf<Int>()
    while (i < a.size) {

        if (a[i].equals("X")) x.add(i)
        if (a[i].equals("O")) o.add(i)
        i++
    }
    //x.forEach { println(it) }
// println("o")
    var q = o.size - 1
    while (q > 0) {
        var d = o[q] - o[q - 1]
        var k = o[q - 1] - d
        when (d) {
            1, 4, 3, 5, 8, 9, 10 -> if (k > 0 && k < a.size) if (a[k] == "-") return " k $k"

        }
        q--
    }
    q = x.size - 1
    while (q > 0) {
        var d = x[q] - x[q - 1]
        var k = 0
        if (d > 8) k = d / 2 else k = x[q - 1] - d

        when (d) {
            1, 4, 3, 5, 8, 10, 9 -> if (k > 0 && k < a.size) if (a[k] == "-") return " k $k"

        }
        q--
    }


    return "$i"
}