package com.example.codingce11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Beginner7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beginner7)

            val next_button7 = findViewById<View>(R.id.next_button7) as Button
            next_button7.setOnClickListener {
                    startActivity(
                        Intent(
                            this@Beginner7,
                            Beginner8::class.java
                        )
                    )
        }
    }
}