package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.*
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar!!.title = "2021-2022 UC Women's Basketball"

        val scheduleButton: Button = findViewById(R.id.scheduleButton)
        scheduleButton.setOnClickListener {
            val intent = Intent(this, scheduleActivity::class.java)
            startActivity(intent)
        }


        val rosterButton: Button =findViewById(R.id.rosterButton)
        rosterButton.setOnClickListener {
            val intent = Intent(this, rosterActivity::class.java)
            startActivity(intent)
        }


        val infoButton: Button = findViewById(R.id.infoButton)
        infoButton.setOnClickListener {
            val intent = Intent(this, infoActivity::class.java)
            startActivity(intent)
        }



    }


}