package com.app.logicprogram.kotlindemo

/**
 * Created by Musharib Ali on 07/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    var p = Program()


    print(p.addTwoNumber(2, 3, { x, y, z -> x + y + z }))
    println(p.addTwoNumber(2, 3) { x, y, z -> x + y + z })
    println(sum(2, 3))
    println(sum2(2, 3))
    println(mul(2, 3))

}

// High Order Function : Lambda expression syntax


val sum = { a: Int, b: Int -> a + b }

//or
val sum2: (a: Int, b: Int) -> Int = { a, b -> a + b }

val mul = { a: Int, b: Int -> a * b }


class Program {

    fun addTwoNumber(a: Int, b: Int, action: (Int, Int, Int) -> Int): Int = action(a, b, b)
}


