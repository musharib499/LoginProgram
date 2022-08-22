package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 15/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println(findSubString("abcd", "bd"))
}


fun findSubString(str: String, pat: String): String? {
    val len1 = str.length - 1
    val len2 = pat.length - 1

    // Check if string's length is
    // less than pattern's
    // length. If yes then no such
    // window can exist
    if (len1 < len2) {
        println("No such window exists")
        return ""
    }
    val hash_pat = intArrayOf()
    val hash_str = intArrayOf()

    // Store occurrence ofs
    // characters of pattern
    for (i in 0 until len2) hash_pat[pat[i].toInt()]++
    var start = 0
    var start_index = -1
    var min_len = Int.MAX_VALUE

    // Start traversing the string
    // Count of characters
    var count = 0
    for (j in 0 until len1) {

        // Count occurrence of characters
        // of string
        hash_str[str[j].toInt()]++

        // If string's char matches
        // with pattern's char
        // then increment count
        if (hash_str[str[j].toInt()]
            <= hash_pat[str[j].toInt()]
        ) count++

        // If all the characters are matched
        if (count == len2) {

            // Try to minimize the window
            while (hash_str[str[start].toInt()]
                > hash_pat[str[start].toInt()]
                || hash_pat[str[start].toInt()]
                == 0
            ) {
                if (hash_str[str[start].toInt()]
                    > hash_pat[str[start].toInt()]
                ) hash_str[str[start].toInt()]--
                start++
            }

            // update window size
            val len_window = j - start + 1
            if (min_len > len_window) {
                min_len = len_window
                start_index = start
            }
        }
    }

    // If no window found
    if (start_index == -1) {
        println("No such window exists")
        return ""
    }

    // Return substring starting
    // from start_index
    // and length min_len
    return str.substring(
        start_index,
        start_index + min_len
    )
}
