package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern

class BasicCarBuilder : CarBuilder {
    private var engine: String? = null
    private var color: String? = null
    private var transmission: String? = null
    private var seats: Int? = null
    private var gps: Boolean? = null

    override fun setEngine(engine: String): CarBuilder {
       this.engine = engine
        return this
    }

    override fun setColor(color: String): CarBuilder {
       this.color = color
        return  this
    }

    override fun setTransmission(transmission: String): CarBuilder {
        this.transmission = transmission
        return this
    }

    override fun setSeats(seats: Int): CarBuilder {
        this.seats = seats
        return this
    }

    override fun setGPS(gps: Boolean): CarBuilder {
        this.gps = gps
        return this
    }

    override fun build(): Car {
        return  Car(engine, color, transmission, seats, gps)
    }
}