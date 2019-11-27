package com.pedromassango.androidkoinsample

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val repository: Repository) : ViewModel() {

    private var messageData: MutableLiveData<String>? = null

    fun loadData(): MutableLiveData<String>? {
        if (messageData == null) {
            messageData = MutableLiveData()
        }
        var ssd=""
        // getting message from repository

        val message = repository.getMessage()
        Log.e("dfs", message.toString())

        messageData!!.postValue(message)

        return messageData
    }
}
