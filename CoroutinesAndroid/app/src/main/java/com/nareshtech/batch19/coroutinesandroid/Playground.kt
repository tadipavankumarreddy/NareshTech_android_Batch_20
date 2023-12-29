package com.nareshtech.batch19.coroutinesandroid

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(){
    println("Main Program starts on: ${Thread.currentThread().name}")

    runBlocking {
        val job = launch {
            println("This Thread runs on : ${Thread.currentThread().name}")
            /*Thread.sleep(1000) - replacing it as this blocks the current
             thread on which this coroutine is running*/
            delay(1000)
            println("This thread ends on: ${Thread.currentThread().name}")
        }
        job.join()

    }


    /*job.cancel()*/

    println("Main Program ends on: ${Thread.currentThread().name}")
}
