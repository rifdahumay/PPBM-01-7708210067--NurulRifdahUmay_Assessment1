package com.example.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_about = findViewById<Button>(R.id.button3)
        btn_about.setOnClickListener {
            startActivity(Intent(this, DeveloperActivity::class.java))
        }
    }
}