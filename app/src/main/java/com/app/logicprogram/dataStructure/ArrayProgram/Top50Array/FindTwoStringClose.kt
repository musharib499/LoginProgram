package com.app.logicprogram.dataStructure.ArrayProgram.Top50Array

fun main() {
  closeStrings("cabbba", "abbccc").apply { println(this) }
  closeStringsWithHashMap("cabbba", "abbccc").apply { println(this) }
}

fun closeStrings(word1: String, word2: String): Boolean {
    if(word1.length != word2.length) return false

    val arra1 = IntArray(26)
    val arra2 = IntArray(26)
    val ch1 = mutableSetOf<Char>()
    val ch2 = mutableSetOf<Char>()


    word1.forEach {
        arra1[it-'a']++
        ch1.add(it)
    }

    word2.forEach {
        arra2[it-'a']++
        ch2.add(it)
    }

    arra1.sort()
    arra2.sort()
    println(arra1.contentToString())
    println(ch1)
    println(arra2.contentToString())
    println(ch2)

    return ch1 == ch2 && arra1.contentEquals(arra2)

}

// Another Way with HashMap
fun closeStringsWithHashMap(word1: String, word2: String): Boolean {
    if(word1.length != word2.length) return false
    var aMap = hashMapOf<Char,Int>()
    var bMap = hashMapOf<Char,Int>()
    word1.forEach {
        aMap.merge(it,1) {a,b-> a+b}
    }

    word2.forEach {
        bMap.merge(it,1) {a,b-> a+b}
    }

    if(aMap.keys != bMap.keys) return false

    return aMap.values.sorted().equals(bMap.values.sorted())

}