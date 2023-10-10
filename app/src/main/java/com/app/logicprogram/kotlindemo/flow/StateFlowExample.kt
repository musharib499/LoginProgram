package com.app.logicprogram.kotlindemo.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
stateFlowDemo()
}

fun stateFlowDemo() = runBlocking {
    val _stateFlow = MutableStateFlow(0)
    val stateFlow = _stateFlow.asStateFlow()
    val tag = "StateFlow :"
    launch {
        stateFlow.collectLatest {
            println("$tag Collector 1 received: $it")
        }
    }
    launch {
        stateFlow.collectLatest {
            println("$tag Collector 2 received: $it")
        }
    }
    launch {
        repeat(10) { i ->
            delay(100)
            _stateFlow.emit(i)
        }
    }

}