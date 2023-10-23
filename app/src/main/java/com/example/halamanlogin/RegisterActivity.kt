package com.example.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegis = findViewById<Button>(R.id.btn_register)
        btnRegis.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}