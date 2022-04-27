package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player7Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player7_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Trinity Palacio"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}