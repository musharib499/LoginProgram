
fun main() {
    val addFive = add(5) // Returns a function that adds 5 to its argument
    val subtractThree = subtract(3) // Returns a function that subtracts 3 from its argument

    val resultAdd = addFive(10)
    val resultSubtract = subtractThree(2) // resultSubtract will be 7

    println("Add: $addFive")
    println("Subtract: $resultSubtract")


    // Reduce
    println(sum) // Output: 15

    // Fold
    println(sumWithInitial) // Output: 25
}

fun add(x: Int): (Int) -> Int {
    // This higher-order function returns a function that adds `x` to its argument
    return { y ->
        println("$x,$y")
        x + y }
}

fun subtract(x: Int): (Int) -> Int {
    // This higher-order function returns a function that subtracts `x` from its argument
    return { y -> y - x }
}



/**

In Kotlin, a higher-order function is a function that can take one or more functions as arguments and/or return a function as its result.

Here are some key points about higher-order functions in Kotlin:

Function Parameters and Return Types:

 1.A higher-order function can accept functions as parameters.
 2.A higher-order function can also return functions.

Lambda Expressions:

 1. Lambda expressions are often used as arguments to higher-order functions.
 2. They allow you to define a concise, inline function without the need for a separate named function.

Standard Higher-Order Functions:
 Kotlin's standard library includes several higher-order functions that operate on collections and other data types:

map: Transforms each element in a collection.
filter: Filters elements based on a given condition.
reduce/fold: Combines elements in a collection to produce a single value.
sortedBy: Sorts a collection based on a given property.
forEach: Performs an action on each element in a collection.
 * */


/**reduce:
The reduce function starts the accumulation with the first element of the collection.
The lambda function takes two arguments: the accumulated value so far and the current element.
It applies the lambda function successively to all elements, accumulating the result.
kotlin*/

val numbers = listOf(1, 2, 3, 4, 5)
val sum = numbers.reduce { acc, number -> acc + number }

/**fold:
 * The fold function allows you to specify an initial value for the accumulation.
 * The lambda function takes two arguments: the accumulated value so far and the current element.
 * It starts the accumulation with the provided initial value and applies the lambda function to all elements.
 * */
val sumWithInitial = numbers.fold(10) { acc, number -> acc + number }





