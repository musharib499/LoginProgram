package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern.factoryMethodPatterns

interface OrganismFactory {
    fun createAnimal(): Animal
    fun createPlat(): Plant
}