package com.app.logicprogram.kotlindemo.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
combineFlow()
}
fun combineFlow() = runBlocking {
    val flow1 = MutableStateFlow(1)
    val flow2 = MutableStateFlow(2)

    launch {
        repeat(5) { i ->
            delay(100)
            flow1.emit(i)
            flow2.emit(i)
        }
    }

    val combinedFlow = flow1.combine(flow2) { value1, value2 ->
        println("value1 $value1 - value2 $value2")
        value1 + value2
    }

// Collect and print the sum of flow1 and flow2
    launch {
        combinedFlow.collect { sum ->
            println("Sum: $sum")
        }
    }
}