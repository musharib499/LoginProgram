package com.app.logicprogram.kotlindemo.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.replay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
sharedFlowDemo()
stateFlowDemo()
    runBlocking {
        flowResult.collectLatest {
            println(it)
        }
    }
}



val flowResult: Flow<String> = flow {
     delay(100L)
     emit("Hello")
}

fun sharedFlowDemo() = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>(
        replay = 1, // Replay the last 2 emitted values to new collectors
        extraBufferCapacity = 8 // Extra buffer capacity to avoid backpressure
    )

    launch {
        sharedFlow.collectLatest {
            println("Collector 1 received: $it")
        }
    }
    launch {
        sharedFlow.collectLatest {
            println("Collector 2 received: $it")
        }
    }
    launch {
        repeat(10) { i ->
            delay(100)
            sharedFlow.emit(i)
        }
    }

}