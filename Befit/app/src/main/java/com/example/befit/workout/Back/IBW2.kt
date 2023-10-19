package com.example.befit.workout.Back

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.befit.R

class IBW2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibw2)

            val button = findViewById<Button>(R.id.button2)
            button.setOnClickListener {
                val intent = Intent(this, IBW3::class.java)
                startActivity(intent)
            }
    }
}