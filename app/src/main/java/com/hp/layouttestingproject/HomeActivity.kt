package com.hp.layouttestingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val linearButton:CardView=findViewById(R.id.card_linear)
        linearButton.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        val relativeButton:CardView=findViewById(R.id.card_relative)
        relativeButton.setOnClickListener {
            val i = Intent(this, RelativeLayout::class.java)
            startActivity(i)
        }
    }
}