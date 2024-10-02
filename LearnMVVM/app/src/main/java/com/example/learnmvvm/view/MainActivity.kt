package com.example.learnmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.learnmvvm.databinding.ActivityMainBinding
import com.example.learnmvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val calculatorViewModel: CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculatorButton.setOnClickListener {
            val num1 = binding.editTextNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.editTextNum2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calculateSum(num1, num2)
            binding.resultTextView.text = "${result.sum}"
        }
    }
}