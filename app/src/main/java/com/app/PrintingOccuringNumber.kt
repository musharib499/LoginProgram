package com.app

import com.app.logicprogram.kotlindemo.flow.combineFlow

fun main() {
    getRepetedNumberChar("mushareb ali integral university",2).apply {
        println(this)
    }
}


fun getRepetedNumberChar(st:String, k:Int) :String {
    var result =""

    val hashMap = HashMap<Char, Int>()

    st.forEach{
        if (it in 'a'..'z') {
            hashMap.merge(it, 1) { old, new -> old + new }
        }
    }


    val list = mutableListOf<A>()
    for((key, value) in hashMap) {
        list.add(A(key,value))
    }

    val newLis =  list.sortedWith(compareBy { it.count })
    for (i in newLis.size-1 downTo   newLis.size - k) {
        val item = newLis[i]
        for (j in 0 until item.count) {
            result += item.name
        }
    }


  return result

}

data class A(var name:Char, var count:Int)

/// intput  a = "mushareb ali integral university"
//  intput  b = 2
//  output  = rrriiii
//    m = 1
//    u = 2
//    s = 2
//    h = 1
//    a = 2
//    r = 3
//    e = 3
//    b = 1
//    l = 2
//    i = 4
//    n = 2
//    t = 2
//    g = 1
//    y = 1
//