package com.app.logicprogram.oops

/**
 * Created by Musharib Ali on 20/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
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