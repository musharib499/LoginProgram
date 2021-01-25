package com.innobles.logicalprogram.kotlin.LooperAndHander


/**
 * Created by Musharib Ali on 24/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    for (i in 0..10) {
        var t = MyThread()
        t.run()
    }


}