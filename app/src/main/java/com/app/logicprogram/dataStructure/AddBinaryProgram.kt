package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 30/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    //  println(addBinary("11", "1"))
    //  println(secondSumThod("11", "1"))
    println(thirdSumMethod("11", "1"))
}

// they work in all case use this method
fun addBinary(a: String, b: String): String {

    var i = a.length - 1
    var j = b.length - 1
    var sum = 0
    var value = ""
    while (i >= 0 || j >= 0 || sum == 1) {
        // '0' ascii value = 48
        // last value sum
        sum += (if (i >= 0) a.get(i) - '0' else 0) + (if (j >= 0) b.get(j) - '0' else 0)

        // value = (sum % 2 + 48).toChar() + value
        value = (sum % 2 + '0'.toInt()).toChar() + value
        sum = sum / 2
        i--
        j--

    }

    return value


}


fun secondSumThod(a: String, b: String): String {
    var sum = ""
    var a1 = a.toLong()
    var b1 = b.toLong()
    b.toLong()
    var carry = 0
    var i = 0
    while (a1 != 0L || b1 != 0L) {
        sum += (a1 % 10 + b1 % 10 + carry) % 2
        carry = ((a1 % 10 + b1 % 10 + carry) / 2).toInt()
        a1 /= 10
        b1 /= 10
    }
    if (carry != 0) sum += carry


    return sum.reversed()

}

fun thirdSumMethod(a: String, b: String): String {
    var sum = ""
    var k = a.length - 1
    var l = b.length - 1
    b.toLong()
    var carry = 0
    while (k >= 0 || l >= 0) {
        val v = ((if (k >= 0) a[k] - '0' else 0) + (if (l >= 0) b[l] - '0' else 0) + carry)
        sum += v % 2
        carry = v / 2
        k--
        l--
    }
    if (carry != 0) sum += carry

    return sum.reversed()

}

