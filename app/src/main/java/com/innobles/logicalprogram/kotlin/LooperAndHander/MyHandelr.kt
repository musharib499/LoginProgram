package com.innobles.logicalprogram.kotlin.LooperAndHander

import android.os.Handler
import android.os.Message
import android.util.Log

/**
 * Created by Musharib Ali on 19/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
open class MyHandelr:Handler() {
    private  val TAG = "MyHandelr"

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        when(msg.what){
            1 -> {
                Log.d(TAG, "handleMessage: Task 1")
            }
            else->{ Log.d(TAG, "handleMessage: Task 2")}
        }
    }
}