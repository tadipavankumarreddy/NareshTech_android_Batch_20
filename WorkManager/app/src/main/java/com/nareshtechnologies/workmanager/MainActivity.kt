package com.nareshtechnologies.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequest
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startMyWork(view: View) {
        // OneTimeRequest
        // PeriodicWorkRequest

        // Just like your JobScheduler, you will need to set up the conditions. we call them as Constraints
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .setRequiresBatteryNotLow(true)
            .build()

        // You can schedule the task
        val oneTimeWork = OneTimeWorkRequestBuilder<MyWork>()
            .setConstraints(constraints)
            .build()

        val periodicWork = PeriodicWorkRequestBuilder<MyWork>(30,
            TimeUnit.DAYS, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, TimeUnit.MILLISECONDS)
            .setConstraints(constraints)
            .build()

        WorkManager.getInstance(this).enqueue(oneTimeWork)
    }
}