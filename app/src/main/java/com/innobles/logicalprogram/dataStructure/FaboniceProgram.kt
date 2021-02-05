package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 4/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    //println(getFibonacci(9))
//    for (i in 0..9){
//        println(getFibonacci(i))
//    }

    printFibNumber(9)
}


fun getFibonacci(n: Int): Int {
    if (n <= 1) return n
    return getFibonacci(n - 1) + getFibonacci(n - 2)
}

// Print all number from 1000 fibonacci

fun printFibNumber(n: Int) {
    var a = 0
    var b = 1
    print("$a ")
    print("$b ")
    for (i in 2..n) {
        b = a + b
        a = b - a
        print("$b ")
    }
}
