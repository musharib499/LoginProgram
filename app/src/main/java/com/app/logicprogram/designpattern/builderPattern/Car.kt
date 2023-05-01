package com.app.logicprogram.designpattern.builderPattern

class Car(
    val engine: String?,
    val color: String?,
    val transmission: String?,
    val seats: Int?,
    val gps: Boolean?
) {
    override fun toString(): String {
        return "Car(engine=$engine, color=$color, transmission=$transmission, seats=$seats, gps=$gps)"
    }
}

