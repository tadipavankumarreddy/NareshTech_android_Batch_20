package com.nareshtechnologies.jobscheduler

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class MyJobService:JobService() {

    override fun onStartJob(params: JobParameters?): Boolean {
        Log.d("MAIN","Job Finished")
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d("MAIN","Job Stopped")
        return false
    }
}