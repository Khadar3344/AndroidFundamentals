package com.example.dependencyinjectionusingdagger_hilt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*val classC = ClassC()
        classC.startClassC()*/ // Without DI

        /*val classC = ClassC()
        classC.classA = ClassA()
        classC.classB = ClassB()
        classC.startClassC()*/ // field injection

        /*val classA = ClassA()
        val classB = ClassB()
        val classC = ClassC(classA, classB)
        classC.startClassC()*/ // constructor injection

        DaggerClassCComponent.create().getClassCInstance().startClassC()
    }
}