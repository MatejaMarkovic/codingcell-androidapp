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

class Beginner4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beginner4)
        val editText = findViewById<EditText>(R.id.unos4)
        val rez = "printf(\"%d minus %d je %d\",x,y,z);"
        val submit_button4 = findViewById<View>(R.id.submit_button4)
        submit_button4.setOnClickListener {
            val text = editText.text.toString()

            val next_button3 = findViewById<View>(R.id.next_button4) as Button
            next_button3.setOnClickListener {
                if (text == rez) {
                    startActivity(
                        Intent(
                            this@Beginner4,
                            Beginner5::class.java
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