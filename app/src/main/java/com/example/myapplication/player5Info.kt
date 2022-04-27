package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player5Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player5_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Markyia McCormick"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}