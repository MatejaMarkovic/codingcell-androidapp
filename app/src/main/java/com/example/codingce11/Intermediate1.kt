package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Intermediate1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intermediate1)
        val next_buttoni1 = findViewById<View>(R.id.next_buttoni1) as Button
        next_buttoni1.setOnClickListener {
            startActivity(
                Intent(
                    this@Intermediate1,
                    Intermediate2::class.java
                )
            )
        }
    }
}