package com.example.befit.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.befit.R
import com.example.befit.databinding.FragmentSlideshowBinding
import com.example.befit.workout.Abs.BABS1
import com.example.befit.workout.Abs.BABS2
import com.example.befit.workout.Abs.IABSW1
import com.example.befit.workout.Back.IBW1
import com.example.befit.workout.Biceps.IBICW1
import com.example.befit.workout.Chest.AVCW01
import com.example.befit.workout.Shoulder.ISHOW1

class WorkoutSelector2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_selector2)

        val chestCard = findViewById<CardView>(R.id.chestWorkoutCard02)
        chestCard.setOnClickListener {
            val intent = Intent(this,AVCW01::class.java)
            startActivity(intent)
        }

        val backCard = findViewById<CardView>(R.id.backWorkoutCard02)
        backCard.setOnClickListener {
            val intent = Intent(this, IBW1::class.java)
            startActivity(intent)
        }

        val absCard = findViewById<CardView>(R.id.absWorkoutCard02)
        absCard.setOnClickListener {
            val intent = Intent(this, IABSW1::class.java)
            startActivity(intent)
        }
        val bicepsCard = findViewById<CardView>(R.id.BicepsWorkoutCard02)
        bicepsCard.setOnClickListener {
            val intent = Intent(this, IBICW1::class.java)
            startActivity(intent)
        }

        val shoulder = findViewById<CardView>(R.id.shoulderWorkoutCard02)
        shoulder.setOnClickListener {
            val intent = Intent(this,ISHOW1::class.java)
            startActivity(intent)
        }
    }
}