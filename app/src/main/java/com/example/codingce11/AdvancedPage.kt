package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AdvancedPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.advanced_page)

        val start_button3 = findViewById<View>(R.id.start_button3) as Button

        start_button3.setOnClickListener {
            startActivity(
                Intent(
                    this@AdvancedPage,
                    Advanced1::class.java
                )
            )
        }
    }
}