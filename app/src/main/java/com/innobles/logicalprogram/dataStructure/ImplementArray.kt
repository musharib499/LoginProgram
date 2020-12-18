package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 27/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */


fun main() {
    var myArray = MyArray()
    myArray.push("hello")
    myArray.push("bye")
    myArray.push("2")
    myArray.push("3")
    myArray.push("4")
    myArray.push("5")
    myArray.delete(3)
    println(myArray.data)

}



class MyArray{
    var length:Int = 0
    var data = arrayListOf<Any>()
    fun get(index:Int):Any{
         //this.data[index]
        return  this.data[index]
    }

    fun push(item:Any){
        this.data.add(item)
        this.length++

    }
    fun pop(){
        this.data.removeLast()
        this.length--
    }
    fun delete(index: Int){
       var item = this.data[index]
     shiftItem(index)
    }
    fun shiftItem(index: Int){
        for (i in index..(length-2)){
            this.data[i] = this.data[i+1]


        }
        this.length -=1
    }




}




