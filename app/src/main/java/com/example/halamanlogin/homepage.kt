package com.example.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val imgprodukmkn = findViewById<ImageView>(R.id.imagemakan)
        imgprodukmkn.setOnClickListener{
            startActivity(Intent(this, BuahJeruk::class.java))
        }
    }
}