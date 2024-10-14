package com.example.dependencyinjectionusingdagger_hilt

import android.util.Log
import javax.inject.Inject

class ClassB @Inject constructor() {
    fun startClassB() {
        Log.i("TAG", "ClassB is starting...")
    }
}