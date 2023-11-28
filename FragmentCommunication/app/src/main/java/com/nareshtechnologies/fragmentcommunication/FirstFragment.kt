package com.nareshtechnologies.fragmentcommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FirstFragment : Fragment() {

    lateinit var e:EditText
    lateinit var b:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_first, container, false)
        e = v.findViewById(R.id.data_edit_text)
        b = v.findViewById(R.id.click_listen)
        b.setOnClickListener { v->
            // get the data out of edittext
            val d = e.text.toString()
            val secondFragment:SecondFragment = SecondFragment.newInstance(d)
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView,secondFragment)?.commit()
        }
        return v
    }
}