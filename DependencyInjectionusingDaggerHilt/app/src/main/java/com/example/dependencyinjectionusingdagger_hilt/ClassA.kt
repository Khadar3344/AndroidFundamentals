package com.example.dependencyinjectionusingdagger_hilt

import android.util.Log
import javax.inject.Inject

class ClassA @Inject constructor() {
    fun startClassA() {
        Log.i("TAG", "ClassA is starting...")
    }
}