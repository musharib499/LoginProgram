package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 09/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
println(findMatchNumber("ASDFGHJKLIA"))
println(findPairSum(8, arrayListOf(1,2,3,4,10,4,5,7)))
  // print(sumBitDiff(arrayListOf(1,2,3,4)))
}


fun findMatchNumber(str: String):String{
    var  hMap  = HashMap<Char, Boolean>()
    var string:String =""
    for (i in str){
      if (hMap[i] != true)
      {
          hMap.put(i, true)
      }
      else{
          string += i.toString()
      }
    }
    return  string
}

fun findPairSum(sum: Int, array: ArrayList<Int>):ArrayList<String>{
    var  hMap  = HashMap<Int, Boolean>()
    var valu:ArrayList<String> = arrayListOf()
    for(i in array){
        if (hMap[i] != true){
            println("check number: ${sum-i}")
            hMap.put(sum - i, true)
        }else{
            println("check add: ${sum-i}")
            valu.add("($i,${sum - i})")
        }
    }
    return valu
}


fun sumBitDiff(array: ArrayList<Int>):Int{
    var total:Int = 0
   for (i in 7 downTo 0){
       var count:Int = 0
       for (j in array){
           var bit  = j.toBinary(8).get(i)
           count += bit.toString().toInt()
       }
       total  += count*(array.size - count)*2
   }

    return total
}

fun findBit(n: Int) :String   {


    return n.toBinary(8)

}
fun Int.toBinary(len: Int): String {
    return String.format("%" + len + "s", this.toString(2)).replace(" ".toRegex(), "0")
}