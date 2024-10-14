package com.example.dependencyinjectionusingdagger_hilt

import android.util.Log

//class ClassC() {
//
//    /*private val classA = ClassA()
//    private val classB = ClassB()
//
//    fun startClassC() {
//        classA.startClassA()
//        classB.startClassB()
//        Log.i("TAG", "ClassC is starting...")
//    }*/     //Without DI
//
//    /*lateinit var classA: ClassA
//    lateinit var classB: ClassB
//
//    fun startClassC() {
//        classA.startClassA()
//        classB.startClassB()
//        Log.i("TAG", "ClassC is starting...")
//    }*/     // field injection
//
//}

class ClassC(private val classA: ClassA, private val classB: ClassB) {
    fun startClassC() {
        classA.startClassA()
        classB.startClassB()
        Log.i("TAG", "ClassC is starting...")
    }
} // constructor injection
