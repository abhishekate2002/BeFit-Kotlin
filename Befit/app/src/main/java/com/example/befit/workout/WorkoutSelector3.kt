package com.example.befit.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.befit.R
import com.example.befit.workout.Abs.AABSW1
import com.example.befit.workout.Back.ABW1
import com.example.befit.workout.Biceps.ABICW1
import com.example.befit.workout.Chest.ADCW01
import com.example.befit.workout.Shoulder.ASHOW1
import kotlin.math.abs

class WorkoutSelector3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_selector3)
        val chestCard = findViewById<CardView>(R.id.chestWorkoutCard)
        chestCard.setOnClickListener {
            val intent = Intent(this,ADCW01::class.java)
            startActivity(intent)
        }

        val backWorkoutCard = findViewById<CardView>(R.id.backWorkoutCard)
        backWorkoutCard.setOnClickListener {
            val intent = Intent(this,ABW1::class.java)
            startActivity(intent)
        }

        val absWorkoutCard = findViewById<CardView>(R.id.absWorkoutCard)
        absWorkoutCard.setOnClickListener {
            val intent = Intent(this,AABSW1::class.java)
            startActivity(intent)
        }

        val bicepsWorkoutCard = findViewById<CardView>(R.id.BicepsWorkoutCard)
        bicepsWorkoutCard.setOnClickListener {
            val intent = Intent(this,ABICW1::class.java)
            startActivity(intent)
        }
        val shoulderWorkoutCard = findViewById<CardView>(R.id.shoulderWorkoutCard)
        bicepsWorkoutCard.setOnClickListener {
            val intent = Intent(this,ASHOW1::class.java)
            startActivity(intent)
        }


    }
}