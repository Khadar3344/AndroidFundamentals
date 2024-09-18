package com.khadarmustafe.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.khadarmustafe.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listItems = arrayOf(
            "Read Quran",
            "Pray Salawat",
            "Android Development",
            "Figma UI/UX design",
            "Ethical Hacking",
            "Jetpack compose projects",
            "Training football",
            "Breakfast (IFtaar)"
        )

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        binding.listView.adapter = listAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You have clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}