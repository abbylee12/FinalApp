package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player12Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player12_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Camryn Nadir"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}