package com.example.shopping

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val logo1 = findViewById<ImageView>(R.id.imageView27)
        // Click event to go to login page
        logo1.setOnClickListener {
            startActivity(Intent(this, settings::class.java)) // Ensure the correct class name
            finish() // Close current activity
        }
        val logo2 = findViewById<ImageView>(R.id.imageView30)
        // Click event to go to login page
        logo2.setOnClickListener {
            startActivity(Intent(this, profile::class.java)) // Ensure the correct class name
            finish() // Close current activity
        }
        val logo3 = findViewById<ImageView>(R.id.imageView28)
        // Click event to go to login page
        logo3.setOnClickListener {
            startActivity(Intent(this, cpage::class.java)) // Ensure the correct class name
            finish() // Close current activity
        }
        val logo4 = findViewById<ImageView>(R.id.wat)
        // Click event to go to login page
        logo4.setOnClickListener {
            startActivity(Intent(this, cart::class.java)) // Ensure the correct class name
            finish() // Close current activity
        }
    }
}