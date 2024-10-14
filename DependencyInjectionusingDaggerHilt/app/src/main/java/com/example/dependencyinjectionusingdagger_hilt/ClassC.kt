package com.example.dependencyinjectionusingdagger_hilt

import android.util.Log

class ClassC {

    private val classA = ClassA()
    private val classB = ClassB()

    fun startClassC() {
        classA.startClassA()
        classB.startClassB()
        Log.i("TAG", "ClassC is starting...")
    }
}