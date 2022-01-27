package com.example.codingce11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.start_button)

        btn.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    HomeSelection::class.java
                )
            )
        }
    }
}