package com.app.logicprogram.dataStructure.collection

import java.util.*

/**
 * Created by Musharib Ali on 12/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    myTreeSet()
}

fun myTreeSet() {
    // Complexity O(Log n)
    // Internal working on Red Black Tree
    // it sorts the elements in the ascending order, reeSet allows null
    var ts = TreeSet<Int>()
    ts.add(10)
    ts.add(4)
    ts.add(5)
    ts.add(100)
    ts.add(1)

    ts.forEach {
        println(it)
    }

}