package com.example.shopping

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val logo = findViewById<ImageView>(R.id.imageView3)
        // Click event to go to login page
        logo.setOnClickListener {
            startActivity(Intent(this, dashboard::class.java)) // Ensure the correct class name
            finish() // Close current activity
        }
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, dashboard::class.java) // Corrected syntax
            startActivity(intent)
        }
    }
}