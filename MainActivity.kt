package com.test.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv:ImageView =findViewById(R.id.iv)

        iv.setOnClickListener {
            val intent =Intent(this,M2::class.java)
            startActivity(intent)
        }

    }
}