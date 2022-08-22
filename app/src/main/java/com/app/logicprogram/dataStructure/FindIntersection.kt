package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 03/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println(FindIntersection(arrayOf("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")))
}

fun FindIntersection(strArr: Array<String>): String {

    // code goes here
    var f = strArr[0].split(", ")
    var s = strArr[1].split(", ")
    println(f)
    println(s)

    var i = 0
    var sp = ""
    while (i < f.size) {
        if (s.contains(f[i])) {
            sp += f[i]
        }
        i++
    }



    return sp

}





