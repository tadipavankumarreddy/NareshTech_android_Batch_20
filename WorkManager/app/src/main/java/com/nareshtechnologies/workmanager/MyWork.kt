package com.nareshtechnologies.workmanager

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWork(val context:Context, workerParameters:WorkerParameters):Worker(context,workerParameters) {

    // You can define any work of your interest
    override fun doWork(): Result {
        val manager: NotificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channel = NotificationChannel("Pavna", "Pavan",NotificationManager.IMPORTANCE_HIGH)
        manager.createNotificationChannel(channel)

       val n = NotificationCompat.Builder(context,"Pavna")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("Enjoy")
            .setContentText("Hello")
            .build()
        manager.notify(234,n)
        return Result.success()
    }
}