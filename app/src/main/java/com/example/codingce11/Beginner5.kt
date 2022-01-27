package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Beginner5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beginner5)
            val next_button5 = findViewById<View>(R.id.next_button5) as Button
            next_button5.setOnClickListener {
                    startActivity(
                        Intent(
                            this@Beginner5,
                            Beginner6::class.java
                        )
                    )
            }
        }
    }