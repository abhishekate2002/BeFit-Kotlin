package com.example.befit.workout.Back

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.befit.R

class BBW2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbw2)
        val next = findViewById<Button>(R.id.button2)
        next.setOnClickListener {
            val intent = Intent(this,BBW3::class.java)
            startActivity(intent)
        }
    }
}