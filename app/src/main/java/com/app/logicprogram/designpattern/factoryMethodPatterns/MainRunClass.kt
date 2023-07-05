package com.app.logicprogram.designpattern.factoryMethodPatterns


fun main() {
    val animalFactory = AnimalFactory()
     animalFactory.createAnimal().speak()

     animalFactory.createPlat().photosynthesize()

}