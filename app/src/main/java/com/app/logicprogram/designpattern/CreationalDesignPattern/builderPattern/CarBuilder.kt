package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern

interface CarBuilder {
    fun setEngine(engine: String): CarBuilder
    fun setColor(color: String): CarBuilder
    fun setTransmission(transmission: String): CarBuilder
    fun setSeats(seats: Int): CarBuilder
    fun setGPS(gps: Boolean): CarBuilder
    fun build(): Car
}