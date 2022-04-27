package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player6Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player6_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Maggie Stephenson"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}