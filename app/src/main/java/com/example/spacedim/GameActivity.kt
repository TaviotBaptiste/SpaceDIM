package com.example.spacedim

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        val button = findViewById<Button>(R.id.nextButtonGame)
        button.setOnClickListener{
            val intent = Intent(this, EndActivity::class.java)
            startActivity(intent)
        }
    }
}