package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class player3Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player3_info)


        val actionBar = supportActionBar

        actionBar!!.title = "Anna Cardwell"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}