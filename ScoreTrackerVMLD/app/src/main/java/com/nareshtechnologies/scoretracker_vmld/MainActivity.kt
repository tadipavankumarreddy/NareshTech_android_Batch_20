package com.nareshtechnologies.scoretracker_vmld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nareshtechnologies.scoretracker_vmld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.result.text = mainViewModel.count.toString()

        mainViewModel.count.observe(this, Observer { t->
            binding.result.text = t.toString()
        })

        binding.plus.setOnClickListener {
            mainViewModel.increment()
        }

        binding.minus.setOnClickListener {
            mainViewModel.decrement()
        }
    }
}