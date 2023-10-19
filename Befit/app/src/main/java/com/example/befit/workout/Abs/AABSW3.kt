package com.example.befit.workout.Abs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.befit.R
import com.example.befit.workout.WorkoutSelector3

class AABSW3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aabsw3)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,WorkoutSelector3::class.java)
            startActivity(intent)
        }
    }
}