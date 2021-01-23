package com.innobles.logicalprogram.kotlin

import kotlinx.coroutines.*

/**
 * Created by Musharib Ali on 08/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
 // usedCoroutines()
    asyncFunction()
}

@ExperimentalCoroutinesApi
fun asyncFunction(){
    runBlocking {
        var value = async{
            delay(10000)
         addtwoNumber(10,20){x,y->
             println(x+y)
         }
        }
        println(value.isActive)
        println(value.onAwait)
    }

}

suspend fun addtwoNumber(a:Int,b:Int,sum:(Int,Int)->Unit){
    sum(a,b)
}



fun usedCoroutines(){

    // GlobalScope.launch() is non-blocking in nature wheres
    // runBlocking() : block the thread in which  it operates


    // First way to define coroutines
 /*   GlobalScope.launch {
        println("Start :${Thread.currentThread().name}")
        delay(1000) // delay is suspended function , and that cancelable
        println("Finish ${Thread.currentThread().name}")
    }

    runBlocking {
        delay(2000)
    }
    println("End ${Thread.currentThread().name}")*/


    // Second type of implement
  runBlocking { // Create a coroutines  that  block the current main thread
      GlobalScope.launch {// T1 thread
          println("Start :${Thread.currentThread().name}")
          delay(1000) // delay is suspended function , and that cancelable
          println("Finish ${Thread.currentThread().name}")
      }


      delay(2000)

      println("End ${Thread.currentThread().name}")  //  main thread
  }





}