package com.example.coroutinesapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    var countTime1 by mutableStateOf(0)
        private set

    var countTime2 by mutableStateOf(0)
        private set

    var isRunning by mutableStateOf(false)
        private set

    private var job: Job? = null

    fun startCounters() {
        if (!isRunning) {
            isRunning = true
            job = viewModelScope.launch {
                for (i in 1..10) {
                    countTime1 = i
                    delay(1000L)
                }
                for (i in 1..10) {
                    countTime2 = i
                    delay(1000L)
                }
                isRunning = false
            }
        }
    }
    fun cancelCounters() {
        job?.cancel()
        isRunning = false
    }
}