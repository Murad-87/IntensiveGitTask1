package com.example.intensivetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text : TextView = findViewById(R.id.tv_counter)
        val btn : Button = findViewById(R.id.btn_click)
        val btnBack : Button = findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
            text.text = "Hello World"
        }

        btn.setOnClickListener {

            text.text = "Hello Aston"
        }
    }
}