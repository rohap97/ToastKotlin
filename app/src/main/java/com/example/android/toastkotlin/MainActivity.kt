package com.example.android.toastkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnS = findViewById<Button>(R.id.button) as Button
        val btnL = findViewById<Button>(R.id.button1) as Button
        val editText = findViewById<EditText>(R.id.edit) as EditText
        val textView = findViewById<TextView>(R.id.text) as TextView

        btnS.setOnClickListener{
            editText.text
            Toast.makeText(this@MainActivity, "THis is short Toast Message", Toast.LENGTH_SHORT).show()
        }

        btnL.setOnClickListener{
            Toast.makeText(this, "This is Long Toast Message", Toast.LENGTH_LONG).show()
        }
    }
}
