package com.innobles.logicalprogram

/**
 * Created by Musharib Ali on 10/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */


fun main() {

    println(containString(arrayListOf("a","d","xx","p"),arrayListOf("g","q","m","s")))

}

fun containString(a1:ArrayList<String>,a2:ArrayList<String>):String{
    var hMap:HashMap<String,Boolean> = HashMap()
    a1.addAll(a2)
    for (i in a1){
        if (hMap[i] != true){
            hMap.put(i,true)
        }else{
            return i
        }
    }
//    for (j in a2){
//        if (hMap[j] != true){
//            hMap.put(j,true)
//        }else{
//            return j
//        }
//    }
  return "No found"

}