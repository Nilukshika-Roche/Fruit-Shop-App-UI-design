package com.example.shopping


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView // Import ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure this is correctly set

        // Fix: Find the ImageView first


        // Apply window insets (optional)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val logo = findViewById<ImageView>(R.id.logo)
        // Click event to go to login page
        logo.setOnClickListener {
            startActivity(Intent(this, second::class.java)) // Ensure the correct class name
            finish() // Close current activity
        }
    }
}
