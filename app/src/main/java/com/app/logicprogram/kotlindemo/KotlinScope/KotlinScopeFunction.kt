package com.app.logicprogram.kotlindemo.KotlinScope

fun main() {
    val details = MyDetails(
        "Mushareb",
        "Khushhalpur",
        110025,
        33
    )
    val letValue = details.let {
        it.name = "Khalid"
    }
    println(letValue)


    val runValue = details.run {
        name = "Khalid"
    }
    println(runValue)


    val withValue = with(details) {
        name = "Khalid"
    }
    println(withValue)

    val applyValue = details.apply {
        name = "Khalid"
    }
    println(applyValue)

    val alsoValue = details.also {
        it.name = "Iftekhar"
    }
    println(alsoValue)

}

data class MyDetails(
    var name: String,
    var address: String,
    var pin: Int,
    var age: Int,
)