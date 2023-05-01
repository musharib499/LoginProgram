package com.app.logicprogram.designpattern.factoryMethodPatterns

interface OrganismFactory {
    fun createAnimal(): Animal
    fun createPlat(): Plant
}