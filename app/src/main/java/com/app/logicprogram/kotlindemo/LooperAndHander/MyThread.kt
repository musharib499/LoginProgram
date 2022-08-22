package com.app.logicprogram.kotlindemo.LooperAndHander

/**
 * Created by Musharib Ali on 24/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
class MyThread : Runnable {
    override fun run() {
        println(Thread.currentThread().id)
    }
}