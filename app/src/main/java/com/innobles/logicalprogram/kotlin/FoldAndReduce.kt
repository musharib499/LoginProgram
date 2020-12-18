package com.innobles.logicalprogram.kotlin

/**
 * Created by Musharib Ali on 07/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    // fold work from initial value total number of sum
    var sumfold = listOf(1,2,3,4).fold(0){s,e -> s+e*10}
    print(sumfold)


    // reduce work from initial value total number of sum
    var sumReduce = listOf(1,2,3,4).reduce(){s,e -> s+e*10}
    print(sumReduce)

    // lateiniit  value

   lateinit var name:String
//   print(name)
    name = "hello"
    println(name)

    flatFunMap()

}


fun flatFunMap(){
    val cars = listOf(
        MotorVehicle("Swift", 2016, "Maruti"),
        MotorVehicle("Altroz", 2020, "Tata"),
        MotorVehicle("Verna", 2019, "Hyundai")
    )
    val bikes = listOf(
        MotorVehicle("R-15", 2018, "Yamaha"),
        MotorVehicle("Gixxer", 2017, "Suzuki")
    )

    val vehicles = listOf(cars, bikes)


    println("FlatMap list")
    // flat map using single list merge two list in single
    val allVehicles = vehicles.flatMap { it }.map { it.manufacturer }
    for (item in allVehicles)
    {
        println(item)
    }



    // flat map using single list merge two list in single

    println("Map list")
    val map = vehicles.map { it }
    for (item in map)
    {
        println(item)
    }





}


data class MotorVehicle(
    val name: String,
    val model: Int,
    val manufacturer: String
)


