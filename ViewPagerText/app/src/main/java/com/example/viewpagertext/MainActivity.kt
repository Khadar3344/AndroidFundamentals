package com.example.viewpagertext

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    // Step 1: Declare Variables
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Step 6: Set Adapter
        viewPager = findViewById(R.id.viewpager)
        pagerAdapter = ViewPagerAdapter()
        viewPager.adapter = pagerAdapter
    }
}

// Step 2: Create ViewPagerAdapter
class ViewPagerAdapter: RecyclerView.Adapter<ViewHolder>() {
    // Step 4: Create a List
    private val itemList = listOf("Delicious meals delivered to your doorstep, at tap",
        "Saver the convenience of culinary delights, delivered to you in minutes.",
        "Hungry? We've got you covered! Order, relax, and let us bring the feast to you.")

    // Step 5: Implement Members

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.page_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

}

// Step 3: Create ViewHolder
class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val pagerText: TextView = itemView.findViewById(R.id.pagerText)
    fun bind(item: String) {
        pagerText.text = item
    }
}