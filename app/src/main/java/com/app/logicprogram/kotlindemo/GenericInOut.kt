package com.app.logicprogram.kotlindemo


fun main() {
   val value = Box(10)
    println(value.value)

    10.basicToString()
}

// Generic type parameters

class Box<T>(t:T) {
    var value = t
}




/** https://kotlinlang.org/docs/generics.html#star-projections
 * Kotlin provides so-called star-projection syntax for this:
 *
 * For Foo<out T : TUpper>, where T is a covariant type parameter with the upper bound TUpper, Foo<*> is equivalent to Foo<out TUpper>. This means that when the T is unknown you can safely read values of TUpper from Foo<*>.
 *
 * For Foo<in T>, where T is a contravariant type parameter, Foo<*> is equivalent to Foo<in Nothing>. This means there is nothing you can write to Foo<*> in a safe way when T is unknown.
 *
 * For Foo<T : TUpper>, where T is an invariant type parameter with the upper bound TUpper, Foo<*> is equivalent to Foo<out TUpper> for reading values and to Foo<in Nothing> for writing values.
 *
 * If a generic type has several type parameters, each of them can be projected independently. For example, if the type is declared as interface Function<in T, out U> you could use the following star-projections:
 *
 * Function<*, String> means Function<in Nothing, String>.
 *
 * Function<Int, *> means Function<Int, out Any?>.
 *
 * Function<*, *> means Function<in Nothing, out Any?>.
 * */


// Generic functions
/**
 * Classes aren't the only declarations that can have type parameters. Functions can, too. Type parameters are placed before the name of the function:
 * */

fun <T> singletonList(item: T): List<T> {
    return emptyList()
}

fun <T> T.basicToString(): String { // extension function
   return this.toString()
}