package com.app.logicprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.app.logicprogram.databinding.ActivityMainBinding
import com.app.logicprogram.fragmentManage.FragmentA
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val scope = GlobalScope
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//
        binding.btnAddFragment.setOnClickListener {

            addFragment(FragmentA.newInstance("",""),true)
        }

        binding.btnMediaterLivedata.setOnClickListener {
          //  replaceFragment(MediaterLiveDataFragment.newInstance(),true)

        }


    }

    override fun onResume() {
        super.onResume()
        setOnOff(true)
    }

    override fun onPause() {
        super.onPause()
        setOnOff(false)
    }

    fun setOnOff(isVisible:Boolean){
        if (isVisible) {
            binding.linearLayout.visibility = View.VISIBLE
            binding.container.visibility = View.GONE
            return
        }
        binding.container.visibility = View.VISIBLE
        binding.linearLayout.visibility = View.GONE
    }

    private fun addFragment(fragment: Fragment, backToStack: Boolean) {
        val support = supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, fragment)
        if (backToStack) support.addToBackStack(fragment.tag)
        support.commit()
    }


    fun replaceFragment(fragment: Fragment, backToStack: Boolean) {
        val support = supportFragmentManager
            .beginTransaction()
            .replace(binding.container.id, fragment)
        if (backToStack) support.addToBackStack(fragment.tag)
        support.commit()
    }
}