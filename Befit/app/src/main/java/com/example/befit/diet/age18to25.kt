package com.example.befit.diet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.befit.R
import com.example.befit.databinding.ActivityAge18to25Binding
import com.example.befit.diet.breakfast.BreakF18to25
import com.example.befit.diet.dinner.Dinner18to25
import com.example.befit.diet.lunch.Lunch18to25

class age18to25 : AppCompatActivity() {
    lateinit var binding : ActivityAge18to25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age18to25)
        val breakfast = findViewById<CardView>(R.id.breakfastCard)
        breakfast.setOnClickListener {
            val intent = Intent(this,BreakF18to25::class.java)
            startActivity(intent)
        }

        val lunch = findViewById<CardView>(R.id.cardView3)
        lunch.setOnClickListener {
            val intent = Intent(this,Lunch18to25::class.java)
            startActivity(intent)
        }

        val dinner = findViewById<CardView>(R.id.cardView)
        dinner.setOnClickListener {
            val intent = Intent(this,Dinner18to25::class.java)
            startActivity(intent)
        }
    }
}