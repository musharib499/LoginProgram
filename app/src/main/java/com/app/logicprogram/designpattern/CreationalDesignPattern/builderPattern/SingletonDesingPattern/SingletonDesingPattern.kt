package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern.SingletonDesingPattern

fun main() {
    SingletonExample.getInstance()?.printHashCode()
    SingletonExample.getInstance()?.printHashCode()

}

class SingletonExample() {
    companion object {
        private var instant: SingletonExample? = null
        fun getInstance(): SingletonExample? = instant ?: run {
            instant = SingletonExample()
            instant
        }
    }

    fun printHashCode() = println(this.hashCode())

}