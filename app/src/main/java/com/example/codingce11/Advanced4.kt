package com.example.codingce11

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Advanced4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.advanced4)

        val next_abutton4 = findViewById<View>(R.id.next_abutton4) as Button
        next_abutton4.setOnClickListener {
            startActivity(
                Intent(
                    this@Advanced4,
                    HomeSelection::class.java
                )
            )
        }
    }
}
