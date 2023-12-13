package com.app

fun main() {
    getIndex(intArrayOf(2,2,3,7,4,3)).apply {
        println(this)
    }
}


fun getIndex(array:IntArray):Int {


    var i = 1
    var n = array.size-1
    var j = n-1
    var sumLeft = array[0]
    var sumRight = array[n]


    var hashMap = HashMap<Int,Int>()

    array.forEach{
        hashMap.merge(it,1) {o,new-> 0+new}
    }
    while(i<n && j>0) {

        if(sumLeft<sumRight) {
            sumLeft += array[i]
            i++
        } else if (sumRight<sumLeft) {
            sumRight += array[j]
            j--
        } else if(sumLeft == sumRight) {
            if(hashMap.contains(sumLeft)) {
                return i
            }

        }

    }


    return -1

}