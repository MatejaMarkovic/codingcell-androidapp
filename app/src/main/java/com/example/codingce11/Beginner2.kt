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

class Beginner2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beginner2)
        val editText = findViewById<EditText>(R.id.unos2)
        val rez = "Number:5"
        val submit_button2 = findViewById<View>(R.id.submit_button2)
        submit_button2.setOnClickListener {
            val text = editText.text.toString()

            val next_button2 = findViewById<View>(R.id.next_button2) as Button
            next_button2.setOnClickListener {
                if (text == rez) {
                    startActivity(
                        Intent(
                            this@Beginner2,
                            Beginner3::class.java
                        )
                    )
                }
                else{
                    fun withCustomStyle() {
                        val positiveButtonClick = { dialog: DialogInterface, which: Int ->
                            Toast.makeText(applicationContext,
                                android.R.string.no, Toast.LENGTH_SHORT).show()
                        }

                        val builder = AlertDialog.Builder(ContextThemeWrapper(this, R.style.AlertDialogCustom))

                        with(builder)
                        {
                            setTitle("Greška!")
                            setMessage("Molimo pokušajte opet.")
                            setPositiveButton("OK", DialogInterface.OnClickListener(function = positiveButtonClick))
                            show()
                        }
                    }
                    withCustomStyle()

                }
            }
        }
    }
}