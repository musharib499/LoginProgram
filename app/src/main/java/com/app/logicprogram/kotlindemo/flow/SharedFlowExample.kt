package com.app.logicprogram.kotlindemo.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
sharedFlowDemo()
stateFlowDemo()
}

fun sharedFlowDemo() = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>()
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