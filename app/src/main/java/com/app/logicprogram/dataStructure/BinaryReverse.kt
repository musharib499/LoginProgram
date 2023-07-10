package com.app.logicprogram.dataStructure

fun main() {
  // println(reverseBit32Bit(526))
   println(isSameAfterReversals(526))
}

fun reverseBit32Bit(n:Int) : Int{
    var isNegative = n<0
    var result = 0
    var previous = 0
    var num = if (n<0) -n else n
    while (num != 0) {
        var current = num%10
        result = result*10 + current
        if ((result - current)/10 != previous ) {
            return 0
        }
        previous = result
        num /= 10
    }
    return if (isNegative) -result else result
}

fun isSameAfterReversals(num: Int): Boolean {
    var first = reverse(num)
    var second = reverse(first)
    return num.equals(second)
}


//A Number After a Double Reversal

fun reverse(num:Int):Int {
    var reverse = 0
    var n = num
    while(n != 0) {
        reverse = reverse*10 + n%10
        n = n/10
    }
    return reverse

}