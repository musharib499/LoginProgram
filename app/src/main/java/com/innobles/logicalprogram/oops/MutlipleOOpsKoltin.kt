package com.innobles.logicalprogram.oops

/**
 * Created by Musharib Ali on 20/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    B1()
}

open class A2() {
    init {
        println("A2")
    }

    constructor(name: String) : this() {
        println(name)
    }


}

class B1 : A2() {
    init {
        println("B")
    }
}