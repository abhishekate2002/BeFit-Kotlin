package com.example.befit.workout.Shoulder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.befit.R
import com.example.befit.workout.WorkoutSelector
import com.example.befit.workout.WorkoutSelector2
import com.example.befit.workout.WorkoutSelector3

class BSHOW3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bshow3)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, WorkoutSelector::class.java)
            startActivity(intent)
        }
    }
}