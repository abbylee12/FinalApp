package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player16Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player16_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Jamia Nesmith"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}