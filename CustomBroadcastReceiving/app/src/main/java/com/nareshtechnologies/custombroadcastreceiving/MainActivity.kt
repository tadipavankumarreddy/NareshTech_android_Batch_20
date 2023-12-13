package com.nareshtechnologies.custombroadcastreceiving

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)

        val intentFilter = IntentFilter(MyReceiver.CUSTOM_BROADCAST)
        registerReceiver(MyReceiver(tv),intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(MyReceiver(tv))
    }
}