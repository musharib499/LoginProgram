package com.innobles.logicalprogram.kotlin.polymorphism

/**
 * Created by Musharib Ali on 8/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
class MyInheritance : MyInterface, MyAbstract() {
    override fun interfaceAdd() {
        TODO("Not yet implemented")
    }

    override fun interfaceAdd(a: Int) {
        TODO("Not yet implemented")
    }

    override fun interfaceAdd(b: String) {
        TODO("Not yet implemented")
    }

    override fun abstractAdd() {
        TODO("Not yet implemented")
    }

    // Cannot create an instance of an abstract class
    // var abs = MyAbstract()
    //  var myInterface = MyInterface()

}