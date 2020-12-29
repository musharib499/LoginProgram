package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 28/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    print(worldMatch(arrayListOf("i", "like", "sam", "sung", "samsung", "mobile", "ice",
        "cream", "icecream", "man", "go", "mango"),"samsung"))
}

fun worldMatch(a:ArrayList<String>,input:String):Boolean{
     var h = HashMap<String,Boolean>()
      var n = input.length
       input.forEachIndexed { index, c ->
           h.put(input.substring(index,n),true)
       }

       a.forEach {
           if (h.containsKey(it)) {
               println(it)
               return true}
       }



return false
}