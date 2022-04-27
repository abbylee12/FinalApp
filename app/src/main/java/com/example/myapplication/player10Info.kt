package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player10Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player10_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Nakiyah BumGardner-Ferguson"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}