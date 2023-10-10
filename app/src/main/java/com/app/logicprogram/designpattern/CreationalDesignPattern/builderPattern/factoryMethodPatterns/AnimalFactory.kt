package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern.factoryMethodPatterns

class AnimalFactory : OrganismFactory {
    override fun createAnimal(): Animal {
        return when ((0..1).random()) {
            0 -> Dog()
            else -> Cat()
        }
    }

    override fun createPlat(): Plant {
        return when ((0..1).random()) {
            0 -> Tree()
            else -> Flower()
        }
    }

}