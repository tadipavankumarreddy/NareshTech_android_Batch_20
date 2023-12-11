package com.nareshtechnologies.notificationsandroid

import android.app.Notification
import android.app.Notification.BigPictureStyle
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity(){
    // TODO 1 : Build the notification
    lateinit var notification: Notification
    lateinit var notificationChannel:NotificationChannel
    val channel_id = "pavan"
    lateinit var manager: NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            // you should now be creating the notificationchannel, otherwise not required
            notificationChannel = NotificationChannel(channel_id,"My Notification Channel",
                NotificationManager.IMPORTANCE_HIGH)
            // This is how we create the notification channel
            manager.createNotificationChannel(notificationChannel)
        }

        val pi = PendingIntent.getActivity(this,12,
            Intent(this, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE)

        // Before you display an image, you should convert the type of the image to BitMap
        val b = BitmapFactory.decodeResource(resources,R.drawable.android)

        notification = NotificationCompat.Builder(this,channel_id)
            .setSmallIcon(R.drawable.baseline_forest_24)
            .setContentTitle("This is my Notification")
            .setContentText("This is the data that i have in place")
            .setContentIntent(pi)
            .setAutoCancel(true)
            .addAction(R.drawable.baseline_forest_24,"Action 1",pi)
            .addAction(R.drawable.baseline_forest_24,"Action 1",pi)
            .setStyle(NotificationCompat.BigPictureStyle().bigPicture(b))
            .build()
    }

    fun sendNotification(view: View) {
        // to send a notification
        // Add this permission to notify the users
        // <uses-permission android:name="android.permission.POST_NOTIFICATIONS" />
        manager.notify(42,notification)
    }

    fun cancelNotification(view: View) {
        /*manager.cancel(42)*/
        manager.cancelAll()
    }

    /**
     * For Any notification that you send, you need three items for sure
     * - small Icon
     * - Title
     * - Message
     *
     * Inorder to send a notification we need to work with two things
     * - NotificationCompat.Builder - to build the notification
     * - NotificationManager - to Manage your Notifications
     *
     * If you want your notification to perform something when it is tapped
     * You need Pending Intent
     * Pending Intent is the description of an action to be performed on a remote location
     * Three ways to create it
     *  - PendingIntent.getActivity(...)
     *  - PendingIntent.getService(...)
     *  - PendingIntent.getBroadcast(...)
     *
     *  They take four arguments
     * */
}