package com.example.befit.diet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.befit.R
import com.example.befit.diet.breakfast.BreakF26to30
import com.example.befit.diet.breakfast.BreakF31to50
import com.example.befit.diet.dinner.Dinner31to50
import com.example.befit.diet.lunch.Lunch31to50

class age31to50 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age30to50)
        val breakfastScreenDirector = findViewById<CardView>(R.id.ag3050brekfcard)
        breakfastScreenDirector.setOnClickListener {
            val intent = Intent(this, BreakF31to50::class.java)
            startActivity(intent)
        }

        val lunch = findViewById<CardView>(R.id.ag3050lunchcard)
        lunch.setOnClickListener {
            val intent = Intent(this,Lunch31to50::class.java)
            startActivity(intent)
        }
        val dinner = findViewById<CardView>(R.id.age3050dinnercard)
        dinner.setOnClickListener {
            val intent = Intent(this,Dinner31to50::class.java)
            startActivity(intent)
        }
    }
}