package com.app.logicprogram.kotlindemo.coroutine

import kotlinx.coroutines.*
import java.util.LinkedList

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

    println("WithContext")
    withContextMethod()
    println("Async")
    asyncMethod()
}

// they return result but execute in sequence (one by one)
fun withContextMethod() = runBlocking {

    val resultOne = withContext(Dispatchers.IO) { doTaskOne() }
    println(resultOne)
    val resultTwo = withContext(Dispatchers.IO) { doTaskTwo() }
    println(resultTwo)
    val resultText = " final result with withContext : ${resultOne} - ${resultTwo}"
    println(resultText)
}

// they return result but execute in parallel (both together)
fun asyncMethod() = runBlocking {

    val resultOne = async { doTaskOne() }
     println(resultOne)
    val resultTwo = async { doTaskTwo() }
    println(resultTwo)
    val resultText = " final result with async : ${resultOne.await()} - ${resultTwo.await()}"
    println(resultText)
}

//  println( withContext(Dispatchers.IO){ doTaskOne() })


private suspend fun doTaskOne(): String {
    var d = 10L
    var s = "$d one"
    delay(d)
  //  println(s)
    return s
}

private suspend fun doTaskTwo(): String {
    var d = 10000L
    var s = "$d Two"
    delay(d)
   // println(s)
    return s
}