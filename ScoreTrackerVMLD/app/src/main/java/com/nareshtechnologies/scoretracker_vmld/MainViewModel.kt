package com.nareshtechnologies.scoretracker_vmld

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel {
    var count:MutableLiveData<Int>
    constructor(){
        // Your ViewModel will be created right here
        count = MutableLiveData()
        count.value = 0
    }

    fun increment(){
        count.value = count.value?.plus(1)
    }

    fun decrement(){
        count.value = count.value?.minus(1)
    }

    override fun onCleared() {
        super.onCleared()
        // Your viewmodel dies here
        Log.v("MAIN","ViewModel is destroyed")
    }
}