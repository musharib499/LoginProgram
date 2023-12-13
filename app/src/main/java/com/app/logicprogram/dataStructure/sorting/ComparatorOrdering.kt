package com.app.logicprogram.dataStructure.sorting

import java.util.*

fun main() {
  sortListByNameInObject(list).apply {
      println(this)
  }
    list.sortedWith(compareBy({it.age},{it.name})).apply {
        println(this)
    }


    sortByTreeMap(list).apply {
        println(this)
    }



}

data class Person(val name:String, val age:Int)
val list = listOf(
    Person("Mushareb", 30),
    Person("Krishna", 18),
    Person("Alok", 20),
)

fun sortListByNameInObject(list: List<Person>): List<Person> {

    return list.sortedWith(compareBy { it.name })
}

// by TreeMap

fun sortByTreeMap(list: List<Person>):List<Person> {
    val sortedSet = TreeSet<Person>(compareBy { it.age })
    sortedSet.addAll(list)

   return sortedSet.toList()
}