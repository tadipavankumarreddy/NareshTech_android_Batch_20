package com.nareshtechnologies.custombroadcastreceiving

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(val tv:TextView) : BroadcastReceiver() {
companion object{
    val CUSTOM_BROADCAST = "com.nareshtechnologies.powerreceiver.CUSTOM_BROADCAST"
}

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if(intent.action == CUSTOM_BROADCAST){
            tv.text = "BROADCAST RECEIVED"
        }
    }
}