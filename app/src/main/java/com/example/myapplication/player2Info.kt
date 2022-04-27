package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player2Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player2_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Alissa Crafton"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}