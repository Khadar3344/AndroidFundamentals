package com.khadarmustafe.intents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.khadarmustafe.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Explicit Intent
        binding.explicitButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }

        // Implicit Intent
        val url = "https://www.google.com/"
        binding.implicitButton.setOnClickListener {
            val implicitButton = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitButton)
        }
    }
}