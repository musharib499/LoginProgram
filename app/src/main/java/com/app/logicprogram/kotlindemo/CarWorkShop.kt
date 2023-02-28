package com.app.logicprogram.kotlindemo

import java.util.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

/*class CarWorkShop  {
    fun makeEvent(date: Date): Unit {

    }
    val permalink get() = "/workshop"

}

fun CarWorkShop.makeEvent(date: Date) : Unit {
}

val CarWorkShop.permalink get() = "/workshop"

private fun useCarWorkshop(workshop: CarWorkShop) {
    val event = workshop.makeEvent(date)
    val permalink = workshop.permalink
    val makeEventRef = CarWorkShop::makeEvent
    val permalinkPropRef = CarWorkShop::permalink
}*/


/*open class A
class B:A()

fun foo(`this$receiver`:A)="A"
fun foo(`this$receiver`:B)="B"
@OptIn(ExperimentalContracts::class)
fun main() {
    val b = B()
    println(foo(b)) // B
    val a:A = b
    println(foo(a)) // A
    println(foo(B())) // B
    println(foo((B() as A))) // A
    val p:String? = null

    if (p.isNullOrBlank()) {
        println("Hello")
    }


}*/

@ExperimentalContracts
inline fun CharSequence?.isNullOrBlank(): Boolean {
    contract {
        returns(false) implies (this@isNullOrBlank != null)
    }
    return this == null || this.isBlank()
}

public fun Iterable<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}

//fun String.isPhoneNumber(): Boolean =
//    length == 7 && all { it.isDigit() }


//fun isPhoneNumber(`$this`: String): Boolean =
//    `$this`.length == 7 && `$this`.all { it.isDigit() }


interface EffectiveKotlinBook {
    fun String.isPhoneNumber(): Boolean
}

class PhoneBookIncorrect {
    fun String.isPhoneNumber(): Boolean {
        return length == 7 && all { it.isDigit() }
    }
}


class PhoneBookCorrect {
}

private fun String.isPhoneNumber(): Boolean {
    return length == 7 && all { it.isDigit() }
}


val reference = String::isPhoneNumber
val phoneNumber = "9643977585"
val boundedReference = phoneNumber::isPhoneNumber


/*val referenceX = PhoneBookIncorrect::isPhoneNumber
val boundedReferenceX = PhoneBookIncorrect()::isPhoneNumber*/

class A {
    val a = 10
}

class B {
    val b = 10
    fun A.update() = a + b
}

fun main() {
    B()
}
