package com.nareshtechnologies.alarmmanager

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import androidx.core.app.NotificationCompat

class MyAlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        // We take an appropriate action to perform some kind of an interactive action.
        val manager = context.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val channel = NotificationChannel("pavan","My Channel",NotificationManager.IMPORTANCE_HIGH)
        val notification: Notification = NotificationCompat.Builder(context,"pavan")
            .setSmallIcon(R.drawable.baseline_water_drop_24)
            .setContentTitle("Drink a Glass of Water")
            .setContentText("Be Hydrated all the time")
            .setAutoCancel(true)
            .build()
        manager.createNotificationChannel(channel)
        manager.notify(42,notification)
    }
}