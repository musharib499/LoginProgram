package com.innobles.logicalprogram.dataStructure.linklist

/**
 * Created by Musharib Ali on 31/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */


fun main() {
println(printProgram(10,4,3))
}

fun printProgram(number:Int, p:Int, m:Int){
  var mod = 1
    for(i in 0..p-1){
        for(j in 0..number-1){
            if(mod > j &&  j % mod == 0 || j == 1) print('x') else  print('o')
        }
        mod +=m -1
        println()

    }


}