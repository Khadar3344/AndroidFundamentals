package com.example.learnviewmodel

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private var counter = 0

    fun getInitialCounter(): Int {
        return counter
    }

    fun getUpdatedCounter(): Int {
        return ++counter
    }
}