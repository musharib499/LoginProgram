package com.app.logicprogram.dataStructure.recursion

/**
 * Created by Musharib Ali on 28/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
println(fact(5))
for (i in 0..5){
    println(fibonacci(i))
}
}

fun fact(n:Int):Int{
    if (n<=1) return 1
    return n* fact(n-1)

}

fun fibonacci(n:Int):Int{
    if (n == 0) return 0
    if (n == 1 || n == 2) return 1
    return fibonacci(n-1) + fibonacci(n-2)
}