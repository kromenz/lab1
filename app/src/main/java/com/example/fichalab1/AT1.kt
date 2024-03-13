package com.example.fichalab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)

        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }

    }
}