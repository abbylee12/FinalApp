package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player8Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player8_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Leilani Pickens"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}