package com.app.logicprogram.kotlindemo

import kotlinx.coroutines.*

/**
 * Created by Musharib Ali on 09/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {

 //coroutineRunBlocks()
  //myCoroutineScope()
  repeatCoroutines()


}

// runBlocking : block current thread for waiting

fun coroutineRunBlocks() = runBlocking {
  println("Start  : ${Thread.currentThread().name}")
  val job = GlobalScope.launch {

    println("Thread  Start  : ${Thread.currentThread().name}")
    println("Thread  End  : ${Thread.currentThread().name}")
  }
//  runBlocking {
//  job.join()
//  }
  println("End  : ${Thread.currentThread().name}")
}



// Scope Builder
fun myCoroutineScope() = runBlocking {
  launch {
    delay(200L)
    println("Task from runBlocking")
  }
  coroutineScope { // Creates a coroutine scope
    launch {
      delay(500L)
      println("Task from nested launch")
    }

    delay(100L)
    println("Task from coroutine scope") // This line will be printed before the nested launch
  }

  println("Coroutine scope is over")
}


fun repeatCoroutines() = runBlocking {
  GlobalScope.launch {
    repeat(1000) { i ->
      println("I'm sleeping $i ...")
    }
  }
 // delay(1300L)
}

