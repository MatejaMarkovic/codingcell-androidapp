package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Intermediate5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intermediate5)
        val next_abutton5 = findViewById<View>(R.id.next_ibutton5) as Button
        next_abutton5.setOnClickListener {
            startActivity(
                Intent(
                    this@Intermediate5,
                    Intermediate6::class.java
                )
            )
        }
    }
}