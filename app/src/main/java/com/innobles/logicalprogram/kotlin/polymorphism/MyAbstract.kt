package com.innobles.logicalprogram.kotlin.polymorphism

/**
 * Created by Musharib Ali on 8/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
abstract class MyAbstract {
    abstract fun abstractAdd()
    open fun nonAbstractAdd() {
        print("Non abstract")
    }
}