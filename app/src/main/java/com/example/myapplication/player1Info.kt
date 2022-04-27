package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class player1Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player1_info)


        val actionBar = supportActionBar

        actionBar!!.title = "Shamiah Bridges"

        actionBar.setDisplayHomeAsUpEnabled(true)




    }
}