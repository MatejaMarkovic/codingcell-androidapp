package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Beginner9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beginner9)

            val next_button9 = findViewById<View>(R.id.next_button9) as Button
            next_button9.setOnClickListener {
                    startActivity(
                        Intent(
                            this@Beginner9,
                            Beginner10::class.java
                        )
                    )
        }
    }
}