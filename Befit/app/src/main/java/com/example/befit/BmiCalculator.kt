package com.example.befit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BmiCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {

            val height = findViewById<EditText>(R.id.height)
            val h = (height.text).toString().toFloat() / 100

            val weight = findViewById<EditText>(R.id.weight)
            val w = weight.text.toString().toFloat()

            val res = w / (h * h)

            val result = findViewById<TextView>(R.id.result)
            result.text = "%.2f".format(res)
        }
    }
}