package com.example.fichalab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)
        var btn = findViewById<Button>(R.id.closeButton)

        btn.setOnClickListener{
            finish()
        }
    }
}