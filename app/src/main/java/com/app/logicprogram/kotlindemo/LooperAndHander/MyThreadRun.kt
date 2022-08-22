package com.app.logicprogram.kotlindemo.LooperAndHander


/**
 * Created by Musharib Ali on 24/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    for (i in 0..10) {
        var t = MyThread()
        t.run()
    }


}