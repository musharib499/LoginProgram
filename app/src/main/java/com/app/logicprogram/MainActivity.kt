package com.app.logicprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.app.logicprogram.databinding.ActivityMainBinding
import com.app.logicprogram.fragmentManage.FragmentA
import com.app.logicprogram.fragmentManage.FragmentB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        replaceFragment(FragmentA(), true)
        lifecycleScope.launch(Dispatchers.Main) {
            delay(8000)
            replaceFragment(FragmentB(), false)
        }


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