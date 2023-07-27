package com.app.logicprogram.designpattern.observerDesignPattern

fun main() {
    val weatherData = WeatherData()
    val displayObserver = DisplayObserver(weatherData)

    weatherData.measurementsChanged()
}

/**The Observer Pattern is a behavioral design pattern that establishes a one-to-many dependency between objects, so that when one object (the subject) changes its state, all its dependents (observers) are notified and updated automatically.

Intent:
The Observer Pattern is used to maintain consistency between related objects when the state of one object changes. It ensures that changes in one object are automatically reflected in other dependent objects without coupling them tightly.

Structure:
The key components of the Observer Pattern are:

Subject: The subject is the object that is being observed. It maintains a list of observers and provides methods to attach, detach, and notify observers of state changes.

Observer: The observer is the interface or abstract class that defines the update method, which is called by the subject when its state changes.

ConcreteSubject: The concrete subject is the specific implementation of the subject. It contains the current state and notifies its observers when the state changes.

ConcreteObserver: The concrete observer is the specific implementation of the observer. It registers with a subject and receives notifications when the subject's state changes.
 */

// Observer interface
interface Observer {
    fun update(temperature: Double, humidity: Double, pressure: Double)
}

// Subject interface
interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}

// ConcreteSubject: WeatherData class
class WeatherData : Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0
    private var pressure: Double = 0.0
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        temperature = 25.0
        humidity = 60.0
        pressure = 1013.0
        notifyObserver()
    }

}

class DisplayObserver(subject: Subject) : Observer {
    init {
        subject.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        println("Temperature: $temperature°C, Humidity: $humidity%, Pressure: $pressure hPa")
    }

}



