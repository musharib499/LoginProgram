package com.app.logicprogram.kotlindemo

import kotlinx.coroutines.*
/**
 * Created by Musharib Ali on 08/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

/** Link : for study ->
 * https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine
 */


fun main() {
 // usedCoroutines()
   // asyncFunction()
    Mycorounte()
    runBlocking { MycorounteScop() }
    main1()

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


fun Mycorounte() = runBlocking {
     println("Start")
    // this: CoroutineScope
    val startTime = System.currentTimeMillis()
    launch { // launch a new coroutine and continue
        delay(3000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    delay(1000)
    println("Hello") // main coroutine continues while a previous one is delayed
    println(System.currentTimeMillis()-startTime)
}

suspend fun MycorounteScop() = coroutineScope {
    println("$this - Start")
    // this: CoroutineScope
    val startTime = System.currentTimeMillis()
    launch { // launch a new coroutine and continue
        delay(3000L) // non-blocking delay for 1 second (default time unit is ms)
        println("$this - World!") // print after delay
    }
    delay(1000)
    println("$this - Hello") // main coroutine continues while a previous one is delayed
    println(System.currentTimeMillis()-startTime)
}


fun main1()  {
    repeat(50) { // launch a lot of coroutines
       val startTime = System.currentTimeMillis()
        print("/")
        Thread {
            Thread.sleep(100L)
            print(".")

        }.start()
        println(System.currentTimeMillis()-startTime)
    }
}