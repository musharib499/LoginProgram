package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern.factoryMethodPatterns


fun main() {
    val animalFactory = AnimalFactory()
     animalFactory.createAnimal().speak()

     animalFactory.createPlat().photosynthesize()

}