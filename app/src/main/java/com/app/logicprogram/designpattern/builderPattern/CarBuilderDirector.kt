package com.app.logicprogram.designpattern.builderPattern

class CarBuilderDirector(private val builder: CarBuilder) {
    fun buildBasicCar(): Car {
        return builder.setEngine("V4")
            .setColor("White")
            .setTransmission("Automatic")
            .setSeats(4)
            .setGPS(false)
            .build()
    }
}