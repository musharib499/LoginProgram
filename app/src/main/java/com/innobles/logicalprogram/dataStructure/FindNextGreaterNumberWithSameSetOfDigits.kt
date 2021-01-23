package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 10/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    findGraterNumber("218765")
    println()
    println(secondMethod("534976"))
    println(thirdMethod("534976"))
}

fun findGraterNumber(s: String) {
    var ss = s.toCharArray()
    var i = ss.size - 1
    while (i > 0) {
        if (ss[i] > ss[i - 1])
            break
        i--

    }
    if (i == 0) print("Not possible") else {


        var x = s[i - 1]
        var min = i
        var j = i + 1
        while (j < s.length) {
            if (ss[j] > x && ss[j] < ss[min]) {
                min = j
            }
            j++
        }
        var temp = ss[min]
        ss[min] = s[i - 1]
        ss[i - 1] = temp

    }

    print(ss.concatToString())


}

fun thirdMethod(s: String): String {
    var ss = s.toCharArray()
    var i = ss.size - 1
    while (i > 0) {
        if (ss[i] > ss[i - 1]) break
        i--
    }
    if (i == 0) return "No possible"
    else {

        var j = i
        var k = ss.size - 1
        while (j < k) {
            var t = ss[k]
            ss[k] = ss[j]
            ss[j] = t
            j++
            k--
        }

        var t = ss[i - 1]
        ss[i - 1] = ss[i]
        ss[i] = t
        return ss.concatToString()

    }

    return ""


}

fun secondMethod(s: String): String {
    var ss = s
    var i = s.length - 1
    while (i > 0) {
        if (ss[i] > ss[i - 1]) break
        i--
    }
    if (i == 0) return "No possible"
    else {

        var s1 = ss.subSequence(0, i)
        var s2 = ss.substring(i, ss.length).reversed()
        var x = "$s1$s2"
        var j = i + 1
//        var min = ss.size-1
//
//        while (j<ss.size/2){
//               if (ss[min]<ss[j]) {
//                   var t = ss[min]
//                   ss[min] = ss[j]
//                   ss[j] = t
//                   min--
//               }
//               j++
//
//
//        }
        var aa = x.toCharArray()
        var t = aa[i - 1]
        aa[i - 1] = aa[i]
        aa[i] = t
        return aa.concatToString()

    }

    return ""


}