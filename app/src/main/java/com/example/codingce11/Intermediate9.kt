package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Intermediate9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intermediate9)
        val next_abutton9 = findViewById<View>(R.id.next_ibutton9) as Button
        next_abutton9.setOnClickListener {
            startActivity(
                Intent(
                    this@Intermediate9,
                    Intermediate10::class.java
                )
            )
        }
    }
}