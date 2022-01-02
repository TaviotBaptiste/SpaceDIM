package com.example.spacedim

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        val button = findViewById<Button>(R.id.launchButtonHomePage)
        button.setOnClickListener{
            val intent = Intent(this, WaitingRoomActivity::class.java)
            startActivity(intent)
        }
    }
}