package com.innobles.logicalprogram.kotlin.LooperAndHander

import android.graphics.Color
import android.os.*
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.innobles.logicalprogram.R
import kotlinx.android.synthetic.main.activity_looper_main.*

class LooperMainActivity() : AppCompatActivity() ,View.OnClickListener {
    val myLooperThread = MyLooperThread()
    private  val TAG = "LooperMainActivity"
    private var myHandelr:MyHandelr? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_looper_main)
        btStart.setOnClickListener(this)
        btStop.setOnClickListener(this)
        btTaskA.setOnClickListener(this)
        btTaskB.setOnClickListener(this)

        object : MyHandelr() {

            override fun handleMessage(msg: Message) = when(msg.what){
                1 -> {
                    Log.d(TAG, "handleMessage: Task 1")
                    btTaskA.setBackgroundColor(Color.GREEN)

                    btTaskB.setBackgroundColor(Color.RED)

                }
                else->{ Log.d(TAG, "handleMessage: Task 2")
                    btTaskB.setBackgroundColor(Color.GREEN)
                    btTaskA.setBackgroundColor(Color.RED)

                }
            }
        }.also { myLooperThread.handler = it }

    }



    override fun onClick(v: View?) {
        v?.let {
            when (it.id) {
                R.id.btStart -> {
                    myLooperThread.start()
                }
                R.id.btStop -> {
                    myLooperThread.looper?.quit()
                }
                R.id.btTaskA -> {
                    val message = Message.obtain()
                    message.what = 1
                    myLooperThread.handler?.sendMessage(message)


                }
                R.id.btTaskB -> {
                    val message = Message.obtain()
                    message.what = 2
                    myLooperThread.handler?.sendMessage(message)

                }
                else ->{ // Note the block
                    print("x is neither 1 nor 2")
                }
            }

            }

    }



}