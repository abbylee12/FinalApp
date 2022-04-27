package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player11Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player11_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Abby Lee"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}