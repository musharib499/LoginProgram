package com.app.logicprogram.kotlindemo.coroutine

import kotlinx.coroutines.*

/**
 * Created by Musharib Ali on 18/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    /*  var scop = CoroutineScope(Job()+Dispatchers.IO)
       scop.launch {
           println("WithContext")
       }*/
    asyncMethod()
    println("WithContext")
    withContextMethod()

}

// they return result but execute in sequence (one by one)
fun withContextMethod() = runBlocking {

    val resultOne = withContext(Dispatchers.IO) { doTaskOne() }
    val resultTwo = withContext(Dispatchers.IO) { doTaskTwo() }
    val resultText = " final result with withContext : ${resultOne} - ${resultTwo}"
    println(resultText)
}

// they return result but execute in parallel (both together)
fun asyncMethod() = runBlocking {

    val resultOne = async { doTaskOne() }
    val resultTwo = async { doTaskTwo() }
    val resultText = " final result with async : ${resultOne.await()} - ${resultTwo.await()}"
    println(resultText)
}

//  println( withContext(Dispatchers.IO){ doTaskOne() })


private suspend fun doTaskOne(): String {
    var d = 1000L
    var s = "$d one"
    delay(d)
    println(s)
    return s
}

private suspend fun doTaskTwo(): String {
    var d = 100L
    var s = "$d Two"
    delay(d)
    println(s)
    return s
}