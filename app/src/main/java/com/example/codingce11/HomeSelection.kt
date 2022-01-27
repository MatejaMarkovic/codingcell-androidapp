package com.example.codingce11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.view.View
import android.widget.Button


class HomeSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_selection)

        val btn1 = findViewById<View>(R.id.button_beginner) as Button

        btn1.setOnClickListener {
            startActivity(
                Intent(
                    this@HomeSelection,
                    BeginnerPage::class.java
                )
            )
        }

        val btn2 = findViewById<View>(R.id.button_intermediate) as Button

        btn2.setOnClickListener {
            startActivity(
                Intent(
                    this@HomeSelection,
                    IntermediatePage::class.java
                )
            )
        }

        val btn3 = findViewById<View>(R.id.button_advanced) as Button

        btn3.setOnClickListener {
            startActivity(
                Intent(
                    this@HomeSelection,
                    AdvancedPage::class.java
                )
            )
        }
    }
}