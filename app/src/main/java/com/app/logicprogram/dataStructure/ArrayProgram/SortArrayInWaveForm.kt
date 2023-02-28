package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
sortArrayInWaveForm(arrayOf(10, 5, 6, 3, 2, 20, 100, 80))
sortArrayInWaveForm(arrayOf(10, 90, 49, 2, 1, 5, 23))
}
private fun sortArrayInWaveForm(array: Array<Int>){
    val n = array.size-1
    var a = array
    for (i in 0..n step  2) {
           if (i>0 && a[i] < a[i-1]) {
               val temp  = a[i-1]
               a[i-1] = a[i]
               a[i] = temp
           }
           if (n>i+1 && a[i] < a[i+1]) {
               val temp  = a[i+1]
               a[i+1] = a[i]
               a[i] = temp
           }
    }
 println(a.contentToString())

}