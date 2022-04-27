package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player13Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player13_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Clarrissa Francis"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}