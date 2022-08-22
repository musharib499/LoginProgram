package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 31/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    print(pairWiseSwapMethod(arrayListOf(1, 2, 3, 4, 5, 6, 7)))
    print(pairMethod(arrayListOf(1, 2, 3, 4, 5, 6)))
    println(pairWiseReverseSwapMethod(arrayListOf(1, 2, 3, 4, 5, 6)))

    //println({4,5,->a+b}))


}


fun pairMethod(a: ArrayList<Int>): ArrayList<Int> {
    var pos = 0
    for (i in 0..(a.size - 1) / 2) { //n/

        a[pos] = a[pos + 1] + a[pos]
        a[pos + 1] = a[pos] - a[pos + 1]
        a[pos] = a[pos] - a[pos + 1]
        pos += 2
    }
    return a
}


fun pairWiseSwapMethod(a: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    val n = a.size - 1
    while (i < n) {
        a[i] = (a[i] + a[i + 1])
        a[i + 1] = a[i] - a[i + 1]
        a[i] = a[i] - a[i + 1]
        i += 2


        print({ a: Int, b: Int -> a + b })
    }
    return a
}


fun pairWiseReverseSwapMethod(a: ArrayList<Int>): ArrayList<Int> {
    var n = a.size - 1
    while (0 <= n) {
        a[n] = a[n] + a[n - 1]
        a[n - 1] = a[n] - a[n - 1]
        a[n] = a[n] - a[n - 1]
        n -= 2
    }
    return a
}