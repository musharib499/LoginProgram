package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 29/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
  //  printPrime(100)
   // printPrime()
    for (i in 0..100){
        if (primeNumberWithRecursion(i)) print("Prime : $i")
    }


}

fun primeNumberWithRecursion(n:Int,i:Int = 2):Boolean{
    if (n == 1) return true
    if (n == 2) return true
    if (n%i == 0 ) return false
    if (i*i>n) return true
    return primeNumberWithRecursion(n,i+1)
}

// While
fun printPrime(){
    var i =1
    var t = 100
    while (i<t){
        var k = 1
        var count  = 0
        if (i == 1)  println("Prime : $i")
        while (k<=i) {
            if (i % k == 0) count += 1
            k++

        }

        if (count == 2)
        {
            println("Prime : $i")
           // count = 0
        }



        i++


    }

}

fun printPrime(n:Int){
    for (i in 1..n) {
        for (j in 1..i) {
            var c = 0
            if (n % j == 0) c += 1
            if (c == 2) print("Prime Number :")

        }
    }
}