package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BeginnerPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beginner_page)

        val start_button1 = findViewById<View>(R.id.start_button1) as Button

        start_button1.setOnClickListener {
            startActivity(
                Intent(
                    this@BeginnerPage,
                    Beginner1::class.java
                )
            )
        }
    }
}