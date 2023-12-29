package com.nareshtechnologies.servicesinandroid

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(checkCallingOrSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
            // We are supposed to request the permissions from the user
            requestPermissions(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION,android.Manifest.permission.ACCESS_COARSE_LOCATION),
                123)
        }
    }

    fun startMusic(view: View) {
        startService(Intent(this,MusicService::class.java))
    }

    fun stopMusic(view: View) {
        stopService(Intent(this,MusicService::class.java))
    }

    fun openMaps(view: View) {
        startActivity(Intent(this,MapsActivity::class.java))
    }
}