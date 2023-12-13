package com.app.logicprogram.kotlindemo

/**
 * Created by Musharib Ali on 14/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
//   var scanner = Scanner(System.`in`)
//     var a = scanner.nextInt()
//    for (i in 1..a) {
//        var p = scanner.nextInt()
//        var d = scanner.nextInt()
//
//        var arr = arrayListOf<Int>()
//        for (j in 0..p){
//            arr.add(scanner.nextInt())
//        }
//
//        println(arr)
//     }
//

    /**/

    val a1 = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    println(a1.contentToString())
//
//    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    //val result = compareTriplets(arrayOf(17,28,30), arrayOf(99,16,8))
    //  println(diagonalDifference(arrayOf(arrayOf(11,2,4),arrayOf(4,5,6),arrayOf(10,8,-12))))
//    println(plusMinus(arrayOf(1, 2, 3, -1, -2, -3, 0, 0)).toString())
    // println(result.joinToString(" "))

}

fun getInputArray(arr: ArrayList<Int>) {

}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var s = mutableListOf<Int>(2)
    for (i in 0..(a.size - 1)) {
        if (a[i] > b[i]) s.add(0, 1)
        else if (a[i] < b[i]) s.add(1, 1)
    }
    println(s.toString())
    return s.toTypedArray()

}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var f = 0
    var s = 0
    for (i in 0..arr.size - 1) {
        f += arr[i][i]
        s += arr[i][arr.size - 1 - i]

    }

    return if (f > s) f - s else s - f

}

fun plusMinus(arr: Array<Int>): String {
    var p: Double = 0.0
    var n: Double = 0.0
    var zero: Double = 0.0
    for (i in 0..arr.size - 1) {
        if (arr[i] > 0) p++
        else if (arr[i] < 0) n++
        else if (arr[i] == 0) zero++
    }


    return "${"%.6f".format(p / arr.size)}\n${"%.6f".format(n / arr.size)}\n${"%.6f".format(zero.toDouble() / arr.size)}"


}