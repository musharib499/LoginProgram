package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
   //println(getSubArray(intArrayOf(1, 4, 20, 3, 10, 5),33).contentToString())
  // println(beautifulDays(20,23,6))
   println(birthday(arrayOf(1,2,1,3,2,),3,2))
}
/**
Time Complexity: O(N)
Auxiliary Space: O(1). Since no extra space has been taken.
* */
private fun getSubArray(array: IntArray,sum:Int):IntArray?{
    var currentSum = array.first()
    var start = 0
    array.forEachIndexed loop@{ index, element ->
        if (index == 0) {
            return@loop
        }
        while (currentSum>sum && start<index) {
            currentSum -= array[start]
            start++
        }

        if (currentSum == sum) {
            return array.copyOfRange(start,index)
        }
            currentSum += element

    }

    return null

}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val s = "123456789"
    for(i in 0..9) {
        var f = 0
        for(j in 0..9) {
            val hashV = HashSet<Char>()
            val hashR = HashSet<Char>()
            val v = board[i][j]
            val r = board[j][i]
            if(s.contains(v)) {
                if(hashV.contains(v)) {
                    return true
                }else {
                    hashV.add(v)
                }
            }

            if(s.contains(r)) {
                if(hashR.contains(r)) {
                    return true
                }else {
                    hashR.add(r)
                }
            }
        }
    }
    return false

}

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var array = mutableListOf<Int>()
    var count = 0

    for(p in i..j) {
        array.add(p)
    }

    array.forEach {
        val v = (Math.abs(it-reverseNumber(it)).toDouble())/k
        val isInt = v.toInt()
        val diff = v-isInt
        if(diff <= 0) {
            count++
        }
    }

    return count


}

fun reverseNumber(number:Int):Int{
    var result = 0
    var reminder = number

    while(reminder>0) {
        result = result*10 + reminder%10
        reminder = reminder/10
    }

    return result
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count = 0
    var j = 0
    var r = 0
    var sum = 0
    while(j<s.size && r<s.size) {
        if(Math.abs(j-r)  <= m && sum<=d){
            sum += s[r]
            r++
            if(Math.abs(j-r) == m && sum == d){
                count++
                sum = 0
                j++
                r = j
            }
        } else {
            j++
            r = j
            sum = 0
        }
    }
    return count

}