package com.example.alertdialogbox

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val showButton : Button = findViewById(R.id.showButton)
        showButton.setOnClickListener {
            showDialog()
        }
    }
    private fun showDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Snapchat")
        builder.setMessage("Do you want to uninstall the app ?")
        builder.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(this, "You are successfully uninstalled", Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss()
        }
        val alertDialog : AlertDialog = builder.create()
        alertDialog.show()
    }
}