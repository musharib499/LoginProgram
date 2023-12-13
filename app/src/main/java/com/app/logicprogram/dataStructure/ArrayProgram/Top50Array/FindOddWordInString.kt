package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
getOldWordList("turing community is m the best", "turing community is the greatest").apply {
    println(this)
}
}

/*Given two strings set1 and set2, find all Odd Words.

A word is called Odd when it appears only once in one of the sets, and does not appear in the other set.

Example 1:

Input: set1 = "turing community is the best", set2= "turing community is the greatest"

Output: ["best", "greatest"]

Example 2:

Input: set1 = "turing turing", set2="google"

Output: ["google"]

Constraints:

1. 1 <= set1. length, set2.length <= 200

set1 and set2 contains of lowercase letters and spaces.

⚫ set1 and set2 have no leading or trailing spaces.

set1 and set2 contains words separated by a single space.
*/

fun getOldWordList(s1 :String, s2:String):List<String> {

    var hash1 = HashMap<String,Int>()
    var list = mutableListOf<String>()

    s1.split(" ").forEach {
        hash1.merge(it,1) { o,n -> o+n}
    }

    s2.split(" ").forEach {
        hash1.merge(it,1) { o,n -> o+n}
    }

    for ((key,value ) in hash1) {
        if (value == 1) {
            list.add(key)
        }
    }

    return list


}

