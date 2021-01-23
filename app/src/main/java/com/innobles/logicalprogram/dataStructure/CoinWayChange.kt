package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 28/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    val a = arrayListOf(2, 5, 3, 6)
//  print(checkSumNumber(a,a.size,4))
    findPairWay(arrayListOf(3, 4, 5, 1, 0, 2, 4, 6))
}

fun checkSumNumber(a: ArrayList<Int>, n: Int, sum: Int): Int {
    if (sum == 0) return 1
    if (sum < 0) return 0
    if (n <= 0 && sum >= 1) return 0
    return checkSumNumber(a, n - 1, sum) + checkSumNumber(a, n, sum - a[n - 1])
}


fun findPairWay(a: ArrayList<Int>) {
    var i = 0
    val k = 3
    val n = a.size
    val sum = 7
    var result = ""
    var value = 0
    while (i < n) {
        var j = 0

        while (j < n) {
            if (result.length < k && value < sum) {
                value += a[j]
                result += "${a[j]}"
                if (value == sum) {
                    println(result)
                    result = ""
                    value = 0
                }
            }
            j++
        }
        i++


    }
}



