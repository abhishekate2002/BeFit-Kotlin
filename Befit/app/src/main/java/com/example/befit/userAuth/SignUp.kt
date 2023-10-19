package com.example.befit.userAuth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import com.example.befit.R
import com.google.firebase.auth.FirebaseAuth

class SignUp : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        auth = FirebaseAuth.getInstance()
        signUpUser()


        val directToLoginBtn = findViewById<Button>(R.id.directToLoginBtn)
        directToLoginBtn.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
    private fun signUpUser() {
        val SmailTf = findViewById<EditText>(R.id.SmailTf)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val SpassTf = findViewById<EditText>(R.id.SpassTf)
        btnSignUp.setOnClickListener {
            if (SmailTf.text.toString().isEmpty()) {
                SmailTf.error = "Please enter mail"
                SmailTf.requestFocus()
                return@setOnClickListener
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(SmailTf.text.toString()).matches()) {
                SpassTf.error = "Please enter valid password"
                SpassTf.requestFocus()
                return@setOnClickListener
            }
            if (SpassTf.text.toString().isEmpty()) {
                SpassTf.error = "Please enter password"
                SpassTf.requestFocus()
                return@setOnClickListener
            }
            auth.createUserWithEmailAndPassword(SmailTf.text.toString(),SpassTf.text.toString()).addOnCompleteListener(this){
                    task ->
                val user = auth.currentUser
                user?.sendEmailVerification()?.addOnCompleteListener {
                    if (task.isSuccessful){
                        startActivity(Intent(this, Login::class.java))
                        finish()
                    }

                }
            }
        }
    }
}