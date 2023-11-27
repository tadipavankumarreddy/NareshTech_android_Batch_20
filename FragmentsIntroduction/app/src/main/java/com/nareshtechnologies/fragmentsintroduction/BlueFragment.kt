package com.nareshtechnologies.fragmentsintroduction

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class BlueFragment : Fragment() {

    interface SendDataBack{
        fun sendDataBackToRed(s:String)
    }

    lateinit var listener2:SendDataBack
    lateinit var tv:TextInputLayout
    lateinit var b2:Button
    fun updateData(d:String){
        tv.editText?.text?.clear()
        tv.editText?.text?.append(d)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_blue, container, false)
        tv = v.findViewById(R.id.tvrv)
        b2 = v.findViewById(R.id.send_data_back)
        b2.setOnClickListener {v->
           listener2.sendDataBackToRed(tv.editText?.text.toString())
        }
        return v
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is SendDataBack){
            listener2 = context
        }
    }
}