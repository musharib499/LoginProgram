package com.innobles.logicalprogram.kotlin

import kotlinx.coroutines.*
import kotlin.system.measureNanoTime

/**
 * Created by Musharib Ali on 08/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

// How to create main function runBlocking

fun main() =  runBlocking {

    val time = measureNanoTime {
        val  mess = async {  getMessageOne()}


        //print(mess)
    }
    println(time)

    var job = launch(Dispatchers.Default) {
        try {
            for (i in 0..100000) {
                if (!isActive) return@launch // break
                //delay(50)
                
                yield() // yield function faster then delay function
                print(" $i,")
            }
        } catch (ex: CancellationException) {
            println("\nException caught safety")
        } finally {
            async {  }
            withContext(NonCancellable) {
                delay(10)
                println("close resource in finally ")
            }
        }
    }



    delay(2)
    job.cancelAndJoin()

   println("Program ended")
    //job.cancel()




}


suspend fun getMessageOne():String{


    return "Hello"
}



suspend fun getMessageTwo():String{
    return "World"



}
