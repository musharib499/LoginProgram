package com.app.logicprogram.dataStructure

import kotlin.math.abs

fun main() {
    println(numberRearrangeFindMinmum(95005))
    println(findLargestNumber(intArrayOf(3,30,34,5,9)))
}
// Smallest Value of the Rearranged Number
fun numberRearrangeFindMinmum(num:Int) :String {
    val st = abs(num).toString()
    val list = mutableListOf<String>()
    st.forEach {
        list.add(it.toString())
    }

   val sorted = list.sortedWith { a, b ->
       val ob = a+b
       val ob1 = b+a
       if (num>0)  ob.compareTo(ob1) else  ob1.compareTo(ob)


   }.toMutableList()

   var j = 0
   while (j < sorted.size-1) {
       if (sorted[j]>"0") {
           if (sorted[0] == "0") {
               val t = sorted[0]
               sorted[0] = sorted[j]
               sorted[j] = t
           }
           break
       }
       j++
   }


   return if (num >0) sorted.joinToString("") else "-"+sorted.joinToString("")
}

// Largest Number with array intArrayOf(3,30,34,5,9) or minimum  Number
fun findLargestNumber(intArray: IntArray) :String {

    val asStrings = intArray.map { it.toString() }

    val sorted = asStrings.sortedWith { a, b ->
        (b+a).compareTo(a+b) // descending order condition
       // (a+b).compareTo(b+a) // ascending order condition
    }

    return sorted.joinToString("")
}