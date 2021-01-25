package com.innobles.logicalprogram.kotlin.LooperAndHander

/**
 * Created by Musharib Ali on 24/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
class MyThread : Runnable {
    override fun run() {
        println(Thread.currentThread().id)
    }
}