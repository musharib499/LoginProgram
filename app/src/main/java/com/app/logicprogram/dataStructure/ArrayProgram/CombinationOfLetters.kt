package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    letterCombinations("234").forEach {
        println(it)
    }

}
private val hash = HashMap<Char, String>().apply {
    put('2',"abc")
    put('3',"def")
    put('4',"ghi")
    put('5',"jkl")
    put('6',"mno")
    put('7',"qprs")
    put('8',"tuv")
    put('9',"wxyz")
}
fun letterCombinations(digits: String): List<String> {

    if(digits.isEmpty()) return listOf()
    return getCombination(digits,"", 0)
}

fun getCombination(digit:String, intitalValue:String, digiIndex:Int) : List<String> {
    val value = hash.getValue(digit[digiIndex]) // abc
    val listResult = mutableListOf<String>()
    value.forEach {
        val combination = StringBuilder(intitalValue)
        combination.append(it)
        if(digiIndex == digit.lastIndex) {
            listResult.add(combination.toString())
        } else {
            listResult.addAll(getCombination(digit,combination.toString(),digiIndex+1))
        }
    }
    return listResult

}