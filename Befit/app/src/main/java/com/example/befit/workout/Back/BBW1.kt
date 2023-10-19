package com.example.befit.workout.Back

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.befit.R

class BBW1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbw1)

        val next = findViewById<Button>(R.id.button)
        next.setOnClickListener {
            val intent = Intent(this,BBW2::class.java)
            startActivity(intent)
        }
    }
}