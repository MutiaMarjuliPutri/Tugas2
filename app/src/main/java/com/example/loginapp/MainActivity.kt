package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var Login_Btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        Login_Btn = findViewById(R.id.login_btn)

        Login_Btn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username == "mutia" && password == "12345678"){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username atau Password Anda Salah",Toast.LENGTH_SHORT).show()
            }
        }
    }
}