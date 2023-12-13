package com.app.logicprogram.dataStructure

import java.util.TreeSet

fun main() {
//    countSubstrings(
//        "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbfefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvdtbtbbtbtbbtbbtbtbbtbtbbtbbtbtbbtbbtbtbbtbtbbtbbtbtbbtbtbbtbbtbtbbtbbtbtbbtbtbbkrkrrkrkrrkrrkrkrrkrkrrkrrkrkrrkrrkdsdssdsdssdssdsdssdsdsbbbbbbbbbbbbbbbbbbbbbbbbbbbpbpihmiqoyrufakigfvuygumaxadgulmhvgjwkvwztiitrzeekjwofeweljjpovbxcsptoubkbwdhuevenunkdihviazzniynifemteabxzzhbgesjxjwlinoswmplbzqxdskndmbojzmwszzgzavjgfxxtlvtilsncpilivurbkfryjywbwjuohfckgavuflwnjhofthtkwowqfdfdlunousyvengfefdkccmjwajrxzvzbqykfqewbywskdqvdcnfwifebmxrmpdcwwwwvxwvsijnexvlalavsuxtojamyelihms", arrayOf(
//            arrayOf(1, 1),
//            arrayOf(1, 4),
//            arrayOf(1, 1),
//            arrayOf(1, 4),
//            arrayOf(0, 2),
//        )
//    ).apply {
//        println(this)
//    }

    numberOfSubstrings("abcabc").apply {
        println(this)
    }

    printSubStrings("abcabc")
}

fun countSubstrings(s: String, queries: Array<Array<Int>>): List<Int> {
    var list = mutableListOf<Int>()




    queries.forEach { e ->
        val startIndex = e[0]
        val endIndex = if (e[1] + 1 <= s.length) e[1] + 1 else s.length
        val subString = s.substring(startIndex, endIndex)
        list.add(getCount(subString))
    }
    return list

}

fun getCount(s: String): Int {
    var tree = TreeSet<String>()
    var str = ""
    for (i in s.indices) {

        for (j in i until s.length) {
            str += s[j]
            if (str.contains('a')) {
                tree.add(str)
            }
        }
    }
    return tree.count()

}


fun numberOfSubstrings(s: String): Int {
    var tree = mutableListOf<String>()

    for(i in 0 until s.length) {
        var str = ""
        for(j in i until s.length) {
            str += s[j]
            if(str.isContains()){
                tree.add(str)
            }
        }

    }
    println(tree.toString())
    return tree.count()
}


fun String.isContains():Boolean {
    return this.contains('a') && this.contains('b') && this.contains('c')
}

fun printSubStrings(str: String) {

    // First loop for starting index
    for (i in 0 until str.length) {
        var subStr = ""

        // Second loop is generating sub-String
        for (j in i until str.length) {
            subStr += str[j]
            print(
                """
                    $subStr
                    
                    """.trimIndent()
            )
        }
    }
}