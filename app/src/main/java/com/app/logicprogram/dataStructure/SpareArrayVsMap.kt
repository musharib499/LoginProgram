package com.app.logicprogram.dataStructure

import android.util.SparseArray
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.runBlocking

fun main() {
    val sp  = SparseArray<String>()
    val map = HashMap<Int,Int>()
    for (i in 0..10) {
        sp.put(i,"${i+i}")
        map[i] = i+i
    }

    sp.valueAt(11)
    map.getValue(11)

}
