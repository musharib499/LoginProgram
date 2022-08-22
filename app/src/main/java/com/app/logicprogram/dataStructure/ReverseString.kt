package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 27/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
 println(reversString("My name musharib"))
}

fun reversString(str:String):String{
    if (str.length<2) return str

    var array = arrayListOf<Char>()
    str.reversed()
    for (i in str.length downTo 1 ){
        array.add(str[i-1])
    }

    return array.joinToString("")
}