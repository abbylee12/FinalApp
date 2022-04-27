package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player4Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player4_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Anastasiia Zakharova"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}