package com.app.logicprogram.dataStructure

import java.time.temporal.TemporalAmount

/**
 * Created by Musharib Ali on 28/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    val a = arrayListOf(2, 1, 3)
    //  print(checkSumNumber(a,a.size,4))

   // print(checkCoin(a, a.size, 4))
    println()
   // print(count(intArrayOf(4, 2, 3), 3, 5))
    println()
    //  print(countWhile(intArrayOf(4, 2, 3), a.size, 2))
    println(coinWayChange(intArrayOf(2,3,5),7))
    // findPairWay(arrayListOf(3, 4, 5, 1, 0, 2, 4, 6))
}

/*
* Time Complexity: O(mn)
* */
fun checkSumNumber(a: ArrayList<Int>, n: Int, sum: Int): Int {
    if (sum == 0) return 1
    if (sum < 0) return 0
    if (n <= 0 && sum >= 1) return 0
    return checkSumNumber(a, n - 1, sum) + checkSumNumber(a, n, sum - a[n - 1])
}

// n =4 [1,2,3] find sum number pair
fun checkCoin(a: ArrayList<Int>, n: Int, sum: Int): Int {

    if (sum == 0) return 1

    if (sum < 0) return 0

    if (n <= 0 && sum >= 1) return 0
    return checkCoin(a, n - 1, sum) + checkCoin(a, n, sum - a[n - 1])
}

fun count(S: IntArray, m: Int, n: Int): Int {
    // table[i] will be storing the number of solutions for
    // value i. We need n+1 rows as the table is constructed
    // in bottom up manner using the base case (n = 0)
    val table = IntArray(n + 1)

    // Base case (If given value is 0)
    table[0] = 1

    // Pick all coins one by one and update the table[] values
    // after the index greater than or equal to the value of the
    // picked coin
    for (i in 0 until m) {
        for (j in S[i]..n)
            table[j] += table[j - S[i]]
    }
    return table[n]
}

fun countWhile(S: IntArray, n: Int, p: Int): Int {
    // table[i] will be storing the number of solutions for
    // value i. We need n+1 rows as the table is constructed
    // in bottom up manner using the base case (n = 0)
    val table = IntArray(p + 1)

    // Base case (If given value is 0)
    table[0] = 1

    // Pick all coins one by one and update the table[] values
    // after the index greater than or equal to the value of the
    // picked coin
    var i = 0
    while (i < n) {
        var j = S[i]
        while (j <= p) {
            table[j] += table[j - S[i]]
            j++
        }
        i++
    }
    /* for (i in 0 until m) {
         for (j in S[i]..n)
             table[j] += table[j - S[i]]
     }*/
    return table[p]
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

// Best Solution


fun coinWayChange(coins:IntArray, amount: Int) :Int {
    val arr = IntArray(amount+1) {amount+1}
    arr[0] = 0

    for (i in 1..amount) {
        for (c in coins) {
            if (i-c>=0) {
                arr[i] = minOf(arr[i], 1+arr[i-c])
            }
        }
    }


    return if(arr[amount] != amount+1) arr[amount] else -1
}




