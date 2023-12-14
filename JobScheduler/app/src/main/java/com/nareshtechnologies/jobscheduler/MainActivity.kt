package com.nareshtechnologies.jobscheduler

import android.app.job.JobInfo
import android.app.job.JobInfo.NETWORK_TYPE_ANY
import android.app.job.JobScheduler
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var jobScheduler: JobScheduler
    lateinit var jobInfo: JobInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler

        jobInfo = JobInfo.Builder(12, ComponentName(packageName,MyJobService::class.java.name))
            .setRequiredNetworkType(NETWORK_TYPE_ANY)
            .build()
    }

    fun scheduleJob(view: View) {
        jobScheduler.schedule(jobInfo)
    }
}