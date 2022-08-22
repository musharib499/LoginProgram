package com.app.logicprogram.kotlindemo.LooperAndHander

import android.os.Looper
import android.util.Log

/**
 * Created by Musharib Ali on 19/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
class MyLooperThread:Thread() {
    private  val TAG = "MyLooperThread"
    var handler:MyHandelr?= null
    var looper:Looper?=null
    override fun run() {
        Looper.prepare()
        looper = Looper.myLooper()
        handler = MyHandelr()
        Looper.loop()
//        for (i in 0..5){
//            Log.d(TAG, "run: "+i)
//            SystemClock.sleep(1000)
//
//        }
        Log.d(TAG, "End thread")
    }
}