package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 02/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun MinWindowSubstring(strArr: Array<String>): String {

    // code goes here
    var f = strArr[0]
    var s = strArr[1]
    var i = 0
    var k = 0
    var last = s
    var current = ""
    while (i < f.length) {
        if (s.contains(f[i])) {
            current += f[i]
        } else {
            if (current.length > 0) current += f[i]
            //  if (current.length > s.length){
            if (last.length > current.length) {
                last = current
                k++
                i = k
            }
            // }
        }
        i++
    }
    return last


}


fun main() {
    println(MinWindowSubstring(arrayOf("ahffaksfajeeubsne", "jefaa")))
}