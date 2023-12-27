package com.nareshtechnologies.servicesinandroid

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicService :Service(){
    lateinit var player: MediaPlayer
    // OnBind is a mandatory method to implement
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    // This is the method that gets invoked when the system calls it.
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // It makes sure that the service restarts after system boot
        player.start()
        return START_STICKY
    }

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this,R.raw.mysong)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }
}