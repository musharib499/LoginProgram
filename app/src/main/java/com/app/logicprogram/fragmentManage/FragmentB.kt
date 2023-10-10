package com.app.logicprogram.fragmentManage

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.logicprogram.R
import com.app.logicprogram.databinding.FragmentBBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentB.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentB : Fragment(), Subject, Observer {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val  tag = "FragmentB"
    private lateinit var binding : FragmentBBinding
    val observers = mutableListOf<Observer>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
               notifyObserver()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentB.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String?, param2: String?) =
            FragmentB().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun onResume() {
        super.onResume()
        Log.d(tag,"onResume")
        register(this)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onStart")
        register(this)
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop()")
        unregister(this)
    }

    override fun notifyObserver() {
        observers.forEach {
            it.update(binding.btn.isChecked)
        }
    }


    override fun register(observer: Observer) {
        if (!observers.contains(observer)) {
            observers.add(observer)
        }
    }

    override fun update(checked: Boolean) {
        Log.d(tag,checked.toString())
    }

    override fun unregister(observer: Observer) {
        observers.remove(observer);
    }
}



interface Observer {
    fun update(checked:Boolean)
}

public interface Subject {
    fun register(observer: Observer)
    fun unregister(observer: Observer)
    fun notifyObserver()

}