package com.app.logicprogram.oops

fun main() {
    val c = ChildClass()
    c.addWithBody()
}

abstract class AsAbstract {

    abstract fun addAbstract()
    abstract fun addTwoAbstract()
    public fun addNewAbstract() {
        println("No Abstruct")
    }

}
class ChildClass : AsAbstract(), AsInterface {
    override fun addAbstract() {
        TODO("Not yet implemented")
    }

    override fun addTwoAbstract() {
        TODO("Not yet implemented")
    }

    override fun add() {
        TODO("Not yet implemented")
    }

    override fun add(a: Int) {
        TODO("Not yet implemented")
    }

    override fun add(b: Int, a: Int) {
        TODO("Not yet implemented")
    }

    override fun addWithBody() {
        super.addWithBody()
    }
}

interface AsInterface {
    fun add()
    fun add(a:Int)
    fun add(b:Int,a:Int)
    fun add(str:String) {} // If define body
    fun add(float: Float) {}
    fun addWithBody() {
        println("Hello with Body function")
    }
}