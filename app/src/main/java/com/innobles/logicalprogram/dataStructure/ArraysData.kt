package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 10/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    //arrayFunctionality()
    //advanceObject()
    var wizerd = Wizerd("Musharib","Ali")
    wizerd.introduce()

}

fun arrayFunctionality(){
    var arr = charArrayOf('a','b','c','d','e')
   for (i in  arr){
       print(i)
       print(",")
   }



}


fun advanceObject(){
    // reference type

    var obj1 = {10}
    var obj2 = obj1
    var obj3 = {10}
    var obj4 = {fun add(){
        print("hello")} }
 print(obj4.apply {  })

 // context vs scope
    contextScope()

}

fun contextScope(){
    val a = 4
    val b= 4
    print(a==b)
}

 open class Player{
    var name:String = ""
    var type:String = ""
    constructor(name:String, type:String){
        this.name = name
        this.type = type
    }

    fun introduce() {
        print("Hi my name ${this.name} , I'm ${this.type}")
    }
}

class Wizerd(name: String, type: String) : Player(name, type) {
   fun play(){
       print("WEEEEEEEE ${this.type}")
   }

}


