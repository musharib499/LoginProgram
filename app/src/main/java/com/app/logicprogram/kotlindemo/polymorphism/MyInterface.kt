package com.app.logicprogram.kotlindemo.polymorphism

/**
 * Created by Musharib Ali on 7/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
interface MyInterface {
    fun interfaceAdd()
    fun interfaceAdd(a: Int)
    fun interfaceAdd(b: String)
    fun addInterface(): Int {
        return 10
    }
}