package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 09/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */

fun main() {
    print(subPPString("abcd", "cdabcdcabcdabcd"))
    print(subPPString("BOB", "BOABOB"))
}
//BOABOB


fun subPPString(find: String, str: String): Int {

    var hMap: HashMap<String, Boolean> = HashMap()
    var count: Int = 0
    var finln = find.length
    hMap.put(find, true)
    for (i in 0..str.length) {
        if ((i + finln) <= str.length) {
            if (hMap[str.substring(i, i + finln)] != true) {
                hMap.put(str.substring(i, i + finln), true)

            } else {
                if (str.substring(i, i + finln) == find)
                   count += 1
            }
        } else {
            return count
        }

    }

    return count
}