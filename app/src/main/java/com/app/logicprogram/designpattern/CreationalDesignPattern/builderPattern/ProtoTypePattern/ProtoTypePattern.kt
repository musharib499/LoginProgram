package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern.ProtoTypePattern

fun main() {
    val concretePrototype = ConcretePrototype().apply { attribute == "Hello" }
    println(concretePrototype.hashCode())
  val client = Client().operation(concretePrototype)
    println(client.hashCode())
}


// Prototype: An interface that defines the copy() method, which creates a copy of the object.
interface Prototype {
    fun copy(): Prototype
}

/*
* ConcretePrototype: A class that implements the Prototype interface.
* It provides the implementation of the copy() method, which creates a copy of the object.*/
class ConcretePrototype : Prototype {
    var attribute: String = ""
    override fun copy(): Prototype {
       val copy = this
        copy.attribute = attribute
        return copy
    }
}

class Client {
    fun operation(prototype: Prototype):Prototype {
        return prototype.copy()
        // use the clone
    }
}
