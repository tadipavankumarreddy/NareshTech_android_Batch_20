package com.nareshtechnologies.servicesinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startMusic(view: View) {
        startService(Intent(this,MusicService::class.java))
    }

    fun stopMusic(view: View) {
        stopService(Intent(this,MusicService::class.java))
    }
}