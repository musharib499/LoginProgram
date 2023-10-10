package com.app.logicprogram.kotlindemo.coroutine.channel

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/** https://kotlinlang.org/docs/coroutines-and-channels.html#channels*/
fun main() {
    channelCommunication()

}


fun channelCommunication() = runBlocking {

    val channel = Channel<String>()
    launch {
        for (i in 1..100) {
            channel.send("A - $i")
        }
    }

  val job =  launch {
        for (i in 1..100) {
            channel.send("B - $i")
        }
    }

        launch {
            var count = 1
           while (true) {
              val recive =   channel.receive()
               println("First $recive  -- ${count++}")
            }
        }
//    launch {
//        var count = 1
//        while (true) {
//            val recive =   channel.receive()
//            println("Second $recive -------------- ${count++}")
//        }
//    }
//    launch {
//        var count = 1
//        while (true) {
//            val recive =   channel.receive()
//            println("Third $recive -------------- ${count++}")
//        }
//    }



}