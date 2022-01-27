package com.example.codingce11

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Intermediate3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intermediate3)
        val editText = findViewById<EditText>(R.id.unosa3)
        val rez = "16"
        val submit_abutton3 = findViewById<View>(R.id.submit_ibutton3)
        submit_abutton3.setOnClickListener {
            val text = editText.text.toString()

            val next_abutton3 = findViewById<View>(R.id.next_ibutton3) as Button
            next_abutton3.setOnClickListener {
                if (text == rez) {
                    startActivity(
                        Intent(
                            this@Intermediate3,
                            Intermediate4::class.java
                        )
                    )
                } else {
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