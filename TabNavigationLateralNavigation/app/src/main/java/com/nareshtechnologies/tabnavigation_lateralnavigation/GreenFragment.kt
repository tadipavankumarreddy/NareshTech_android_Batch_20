package com.nareshtechnologies.tabnavigation_lateralnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class GreenFragment : Fragment() {
    lateinit var b1:Button
    lateinit var b2:Button
    lateinit var tv:TextView
    var count:Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v:View =  inflater.inflate(R.layout.fragment_green, container, false)
        b1 = v.findViewById(R.id.button1)
        b2 = v.findViewById(R.id.button2)
        tv = v.findViewById(R.id.result)

        b1.setOnClickListener { v->
            count++
            tv.text = count.toString()
        }

        b2.setOnClickListener { v->
            if(count!=0){
                count--
            }
            tv.text = count.toString()
        }
        return v
    }
}