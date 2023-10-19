package com.example.befit.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.befit.R
import com.example.befit.databinding.FragmentSlideshowBinding
import com.example.befit.workout.Abs.BABS1
import com.example.befit.workout.Back.BBW1
import com.example.befit.workout.Biceps.BBICW1
import com.example.befit.workout.Chest.BCW1
import com.example.befit.workout.Shoulder.BSHOW1

class WorkoutSelector : AppCompatActivity() {
    var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_selector)

        val bcwc = findViewById<CardView>(R.id.chestWorkoutCard)

        bcwc.setOnClickListener {
            val intent = Intent(this,BCW1::class.java)
            startActivity(intent)
        }

        val backWorkoutCard = findViewById<CardView>(R.id.backWorkoutCard)
        backWorkoutCard.setOnClickListener {
            val intent = Intent(this,BBW1::class.java)
            startActivity(intent)
        }

        val absWorkoutCard = findViewById<CardView>(R.id.absWorkoutCard)
        absWorkoutCard.setOnClickListener {
            val intent = Intent(this,BABS1::class.java)
            startActivity(intent)
        }

        val shoulderWorkoutCard = findViewById<CardView>(R.id.shoulderWorkoutCard)
        shoulderWorkoutCard.setOnClickListener {
            val intent = Intent(this,BSHOW1::class.java)
            startActivity(intent)
        }


    }
}