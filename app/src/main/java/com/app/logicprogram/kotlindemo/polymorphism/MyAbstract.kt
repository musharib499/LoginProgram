package com.app.logicprogram.kotlindemo.polymorphism

/**
 * Created by Musharib Ali on 8/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
abstract class MyAbstract {
    abstract fun abstractAdd()
    open fun nonAbstractAdd() {
        print("Non abstract")
    }
}