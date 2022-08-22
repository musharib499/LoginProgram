package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 11/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    var arrayList = arrayListOf(arrayOf(1,2,3,4), arrayOf(5,6,7,8), arrayOf(9,10,11,12),arrayOf(13,14,15,16))
    rotateMatric(90,arrayList)
}
fun rotateMatric(degre:Int,array:ArrayList<Array<Int>>){

//    for (x in array){
//        for (j in x){
//            print(j)
//            print(" ")
//        }
//        println()
//    }
 var n= array[0].size -1

    for (x in 0..array.size/2) {
        for (y in x..n/2) {
            var temp = array[x][y]
            array[x][y] = array[y][n - x]
            array[y][n - x] = array[n - x][n - y]
            array[n - x][n - y] = array[n - y][x]
            array[n - y][x] = temp

        }


    }


    println(" -----------------")
        for (x in array) {
            for (j in x) {
                print(j)
                print(" ")
            }
            println()
        }
    print("---------------- ")





}