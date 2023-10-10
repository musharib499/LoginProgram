package com.app.logicprogram.kotlindemo

fun main() {
   add(1,2,3,4,5,6).apply {
       println(this)
   }
}

fun add(vararg a:Int):List<Int> {
    val list = mutableListOf<Int>()
    a.forEach {
        list.add(it)
    }
    return list

}