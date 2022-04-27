package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player9Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player9_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Dakota Reeves"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}