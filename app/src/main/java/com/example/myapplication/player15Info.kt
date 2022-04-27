package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player15Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player15_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Sierra Davis"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}