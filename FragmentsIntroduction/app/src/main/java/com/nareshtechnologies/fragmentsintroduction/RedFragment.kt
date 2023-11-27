package com.nareshtechnologies.fragmentsintroduction

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class RedFragment : Fragment() {
    lateinit var listener:SendData
    lateinit var b:Button
    lateinit var e:TextInputLayout

    fun updateMyData(s:String){
        e.editText?.text?.clear()
        e.editText?.text?.append(s)
    }
    interface SendData{
        fun sendDataToBlueFragment(d:String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is SendData){
            listener = context as SendData
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_red, container, false)

        b = v.findViewById(R.id.send_data)
        e = v.findViewById(R.id.tip)

        b.setOnClickListener { v->
            // Handle the button click over here
            val d = e.editText?.text.toString()
            listener.sendDataToBlueFragment(d)
        }
        return v
    }
}