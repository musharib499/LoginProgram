package com.app.logicprogram.dataStructure

fun main() {
    convert("PAYPALISHIRING", 3).apply { println("Mushareb $this") }
}

fun convert(s: String, numRows: Int): String {

    var result = StringBuilder()
    val n = s.length
    val interval = 2 * numRows - 2

    for (i in 0 until numRows) {

        for (j in i until n step interval) {
            result.append(s[j])
            var intv = j + interval - 2 * i
            if (i != 0 && i != numRows - 1 && intv < n) {
                result.append(s[intv])
            }
        }
    }

    return result.toString()

}