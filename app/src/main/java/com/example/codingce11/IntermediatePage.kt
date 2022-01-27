package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class IntermediatePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intermediate_page)

        val start_button2 = findViewById<View>(R.id.start_button2) as Button

        start_button2.setOnClickListener {
            startActivity(
                Intent(
                    this@IntermediatePage,
                    Intermediate1::class.java
                )
            )
        }
    }
}