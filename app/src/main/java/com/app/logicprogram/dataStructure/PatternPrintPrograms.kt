package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 4/2/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    printHalfPyramid(4)
    println()
    printInvertHalfPyramid(4)
    printHollowInvertHalfPyramid(4)
    printFullPyramid(10)
    println()
    printInverseFullPyramid(10)
}

// Half Pyramid
/*
*     *
*     **
*     ***
*     ****
*     *****
* */


fun printHalfPyramid(row: Int) {

    for (i in 0..row) {

        for (j in 0..i) {
            print("*")
        }
        println()
    }

}

// Invert Half Pyramid
/*
*     *****
*     ****
*     ***
*     **
*     *
* */
fun printInvertHalfPyramid(row: Int) {

    for (i in 0..row) {

        for (j in 0..row - i) {
            print("*")
        }
        println()
    }

}

// Invert Hollow Half Pyramid
/*
*     *****
*     *  *
*     * *
*     **
*     *
* */


fun printHollowInvertHalfPyramid(row: Int) {

    for (i in 0..row) {
        for (j in 0..row - i) {
            if (i == 0 || j == 0 || j == row - i) print("*") else print(" ")
        }
        println()
    }

}

fun printFullPyramid(row: Int) {
    for (i in 0..row / 2) {

        for (j in 0..row / 2 - i) {
            print(" ")
        }
        for (k in 0..i) {
            print("* ")
        }
        println()
    }
}

fun printInverseFullPyramid(row: Int) {
    for (i in 0..row / 2) {
        for (k in 0..i) {
            print(" ")
        }
        for (j in 0..row / 2 - i) {
            print(" *")
        }

        println()
    }
}



