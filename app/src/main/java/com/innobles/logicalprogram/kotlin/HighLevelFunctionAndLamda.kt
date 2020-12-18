package com.innobles.logicalprogram.kotlin

/**
 * Created by Musharib Ali on 07/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
  var p = Program()


    print(p.addTwoNumber(2,3,{x,y,z -> x+y +z}))
    print(p.addTwoNumber(2,3){x,y,z -> x+y+z})


}

class Program{

    fun addTwoNumber(a:Int,b:Int,action:(Int,Int,Int)->Int):Int = action(a,b,b)
}


