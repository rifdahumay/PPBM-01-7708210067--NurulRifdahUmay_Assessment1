package com.example.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Snack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)

        val img_jeruk = findViewById<ImageView>(R.id.orangefruit)
        img_jeruk.setOnClickListener{
            startActivity(Intent(this, BuahJeruk::class.java))
        }
    }
}