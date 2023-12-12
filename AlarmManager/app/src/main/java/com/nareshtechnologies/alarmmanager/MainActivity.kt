package com.nareshtechnologies.alarmmanager

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {
    lateinit var alarm:AlarmManager
    lateinit var pi:PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alarm = getSystemService(ALARM_SERVICE) as AlarmManager
        pi = PendingIntent.getBroadcast(this,12,
            Intent(this,MyAlarmReceiver::class.java),
            PendingIntent.FLAG_IMMUTABLE)
    }

    fun stopAlarm(view: View) {
            alarm.cancel(pi)
    }
    fun startAlarm(view: View) {
        /**
         * I want an alarm that reminds the user to have a glass of water every 2 minutes*/
        val alarmType = AlarmManager.ELAPSED_REALTIME // I want relative time
        val firstTriggerTime = SystemClock.elapsedRealtime()
        val intervalTime:Long = 30*1000
        // Now when the alarm ticks, we need a PendingIntent to trigger our Broadcast
        alarm.setInexactRepeating(alarmType,firstTriggerTime,
            intervalTime,pi)
    }
}