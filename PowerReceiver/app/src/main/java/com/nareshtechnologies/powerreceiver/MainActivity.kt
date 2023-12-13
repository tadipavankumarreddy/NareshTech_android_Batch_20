package com.nareshtechnologies.powerreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Filter
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    lateinit var intentFilter: IntentFilter

    companion object{
        val CUSTOM_BROADCAST = "com.nareshtechnologies.powerreceiver.CUSTOM_BROADCAST"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)

        intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        intentFilter.addAction(CUSTOM_BROADCAST)

        registerReceiver(PowerReceiverBroadcast(imageView),intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(PowerReceiverBroadcast(imageView))
    }

    fun sendCustomBroadcast(view: View) {
        // We write the code for sending a custom broadcast
        sendBroadcast(Intent(CUSTOM_BROADCAST))
    }
}

/**
 * First create a broadcast receiver
 * Rightclick on app > new > Choose Other > BroadcastReceiver
 * You will get a pop up fill in the details Make sure enabled and exported options are checked.
 *
 * Register your receiver with the broadcasts that you are interested in.
 * Make sure you are also unregistering the broadcasts*/