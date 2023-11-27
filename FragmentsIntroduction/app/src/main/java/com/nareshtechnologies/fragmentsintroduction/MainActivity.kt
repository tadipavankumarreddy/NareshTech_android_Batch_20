package com.nareshtechnologies.fragmentsintroduction

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(),RedFragment.SendData, BlueFragment.SendDataBack {
    lateinit var blueFragment: BlueFragment
    lateinit var redFragment: RedFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        blueFragment = BlueFragment()
        redFragment = RedFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container2,blueFragment)
            .replace(R.id.fragment_container1,redFragment).commit()
    }

    override fun sendDataToBlueFragment(d: String) {
        // How to Send data to bluefragment
        blueFragment.updateData(d)
    }

    override fun sendDataBackToRed(s: String) {
        redFragment.updateMyData(s)
    }

}