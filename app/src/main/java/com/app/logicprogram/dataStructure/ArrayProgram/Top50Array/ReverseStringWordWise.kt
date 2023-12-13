package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

//    var userDetails:UserDetails? = UserDetails(null,10)
//    //var userDetails1:UserDetails1? = UserDetails1(null,10)
//
//    userDetails?.let {
//        println(it.userName) // null
//    }


    val p1 = Point(10,11)
    val p2 = Point(12,13)

    var p = p1.plus(p2)

    println(p.x)

}

class Point(val x:Int, val y : Int) {
    operator fun plus(other:Point):Point {
        return  Point(x+other.x, y+other.y)
    }
}


data class UserDetails(var userName:String?, var age:Int)

data class UserDetails1(var userName:String, var age:Int)





open class A {


    fun add(a:Int, b:String){}
}


fun printHello() {
    println("Hello")
}

fun printWorldHello() {
    println("World!")
}


//fun getStringReverse(s:String) :String {
//    var array = s.split(" ")
//    var i = 0
//    var newString = ""
//
//    while (i<array.size) {
//        newString += array[i].reversed()
//        newString += " "
//        i++
//    }
//    return newString
//}