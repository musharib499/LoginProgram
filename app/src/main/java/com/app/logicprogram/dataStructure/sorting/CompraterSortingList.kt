package com.app.logicprogram.dataStructure.sorting

import java.util.Scanner

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val s = Scanner(System.`in`)
    val n =  s.nextInt()
    val list = mutableListOf<Person1>()
    for(i in 0 until n) {
        val name = s.next()
        val score = s.nextInt()
        val p = Person1(name,score)
        list.add(p)
    }

    getSortList(list).forEach {
        println("${it.name}  ${it.score}")
    }
}
data class Person1(val name:String, val score:Int)

val comparable = Comparator<Person1> {a,b ->
    return@Comparator b.score - a.score
}


fun getSortList(list:List<Person1>):List<Person1> {

    return list.sortedWith(compareByDescending<Person1> {it.score}.thenBy { it.name })


}