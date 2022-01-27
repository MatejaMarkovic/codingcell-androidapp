package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Intermediate7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intermediate7)
            val next_abutton7 = findViewById<View>(R.id.next_ibutton7) as Button
            next_abutton7.setOnClickListener {
                startActivity(
                    Intent(
                        this@Intermediate7,
                        Intermediate8::class.java
                    )
                )
            }
        }
    }
