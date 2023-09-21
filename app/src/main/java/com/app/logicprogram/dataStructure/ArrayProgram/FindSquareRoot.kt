package com.app.logicprogram.dataStructure.ArrayProgram
fun main() {

  println(findSquareRoot(4))
}


fun findSquareRoot(x:Int):Int {
    var a = 0

    while (!(a*a<=x && (a+1)*(a+1)>x)){
        a++
    }
    return a
}