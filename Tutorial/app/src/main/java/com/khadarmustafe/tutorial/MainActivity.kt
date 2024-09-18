package com.khadarmustafe.tutorial

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.khadarmustafe.tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        binding.apply {
            btnApply.setOnClickListener {
                val name = etName.text.toString()
                val age = etAge.text.toString().toInt()
                val country = etCountry.text.toString()
                val person = Person(name, age, country)
                Intent(this@MainActivity, SecondActivity::class.java).also {
                    it.putExtra("EXTRA_PERSON", person)
                    startActivity(it)
                }
            }
        }
    }
}