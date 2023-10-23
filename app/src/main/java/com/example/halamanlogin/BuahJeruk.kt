package com.example.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BuahJeruk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah_jeruk)

        val btn_addcart = findViewById<Button>(R.id.button_addcart)
        btn_addcart.setOnClickListener {
            startActivity(Intent(this, SplashScreen2::class.java))
        }
    }
}