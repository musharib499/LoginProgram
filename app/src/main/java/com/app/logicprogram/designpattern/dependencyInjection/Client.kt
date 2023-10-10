package com.app.logicprogram.designpattern.dependencyInjection

class Client(private val service1: Service1) {
    // Service1 injected by constructor


    // Service2 injected by Method
    private var service2: Service2? = null
    fun setService2(service2: Service2) {
        this.service2 = service2
    }

    // Service3 injected by field (Property injection)
    lateinit var service3: Service3 //







}