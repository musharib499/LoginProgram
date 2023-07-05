package com.app.logicprogram.dataStructure




fun main() {
 val p = genrateLongestPalindromic("abccccdd")
    println(p)
}


fun genrateLongestPalindromic(str:String) :String {
    val hasMap = HashMap<Char,Int>()
    str.forEach {
        if (hasMap.contains(it)) {
            hasMap[it] = hasMap.getValue(it) +1
        }else {
            hasMap[it] = 1
        }
    }
    var  count = 0
    var left = ""
    var oneChar:String = ""
   for ((key, value ) in hasMap) {
       if (value%2 == 0) {
           count+= value
           for (i in 1..value/2) {
               left += key
           }
       }
       if (value == 1 && oneChar == "") {
           oneChar += key
       }
   }



    return left + oneChar + left.reversed()

}