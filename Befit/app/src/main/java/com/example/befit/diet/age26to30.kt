package com.example.befit.diet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.befit.R
import com.example.befit.diet.breakfast.BreakF26to30
import com.example.befit.diet.dinner.Dinner26to30
import com.example.befit.diet.lunch.Lunch26to30

class age26to30 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age26to30)
        val breakfastScreenDirector = findViewById<CardView>(R.id.breakfastCard)
        breakfastScreenDirector.setOnClickListener {
            val intent = Intent(this,BreakF26to30::class.java)
            startActivity(intent)
        }

        val lunch = findViewById<CardView>(R.id.cardView3)
        lunch.setOnClickListener {
            val intent = Intent(this,Lunch26to30::class.java)
            startActivity(intent)
        }

        val dinner = findViewById<CardView>(R.id.cardViewww)
        dinner.setOnClickListener {
            val intent = Intent(this,Dinner26to30::class.java)
            startActivity(intent)
        }
    }
}