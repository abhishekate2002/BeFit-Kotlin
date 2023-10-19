package com.example.befit.userAuth

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.befit.MainActivity
import com.example.befit.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class Login : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = FirebaseAuth.getInstance()
        btnClicks()
    }
    private fun btnClicks() {
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            doLogin()
        }

        val d2SignUp = findViewById<Button>(R.id.d2SignUp)
        d2SignUp.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
            finish()
        }
        val btnForgtotPass = findViewById<Button>(R.id.btnForgotPassword)
        btnForgtotPass.setOnClickListener {
            doSomethong()
        }
    }
    private fun doSomethong() {
        val builder= AlertDialog.Builder(this)
        builder.setTitle("Forgot Pasword")
        val view = layoutInflater.inflate(R.layout.forgot_password,null)
        val username = view.findViewById<EditText>(R.id.etUserName)
        builder.setView(view)
        builder.setPositiveButton("Reset", DialogInterface.OnClickListener{ _, _ ->
            forgotPassword(username)
        })
        builder.setNegativeButton("Close", DialogInterface.OnClickListener{ _, _ ->
            builder.show()
        })
    }
    private fun forgotPassword(username: EditText) {
        if (username.text.toString().isEmpty()){
            return
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(username.text.toString()).matches()){
            return
        }
        auth.sendPasswordResetEmail(username.text.toString()).addOnCompleteListener {task ->
            if (task.isSuccessful){
                Toast.makeText(baseContext, "Email Sent" , Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onCreateView(
        parent: View?,
        name: String,
        context: Context,
        attrs: AttributeSet
    ): View? {
        return super.onCreateView(parent, name, context, attrs)
        super.onStart()
        val currentUser = auth.currentUser
        updateUI(currentUser)

    }
    private fun doLogin() {
        val loginTv = findViewById<EditText>(R.id.loginTv)
        val passTv = findViewById<EditText>(R.id.passTv)
        if (loginTv.text.toString().isEmpty()) {
            loginTv.error = "Please enter mail"
            loginTv.requestFocus()
            return
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(loginTv.text.toString()).matches()) {
            loginTv.error = "Please enter valid password"
            loginTv.requestFocus()
            return
        }
        if (passTv.text.toString().isEmpty()) {
            passTv.error = "Please enter password"
            passTv.requestFocus()
            return
        }
        auth.signInWithEmailAndPassword(loginTv.text.toString(),passTv.text.toString()).addOnCompleteListener(this) {
                task -> if (task.isSuccessful){
            val user = auth.currentUser
            updateUI(user)
        }
        else{
            updateUI(null)
        }
        }
    }
    private fun updateUI(currentUSer: FirebaseUser?) {
        if(currentUSer != null ){
            if (currentUSer.isEmailVerified){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()

            }
            else{
                Toast.makeText(baseContext,"Please verify your email address",Toast.LENGTH_SHORT).show()
            }
        }
        else{
            Toast.makeText(baseContext,"Login Failed",Toast.LENGTH_SHORT).show()
        }
    }
}