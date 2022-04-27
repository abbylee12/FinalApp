package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class rosterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roster)


        val actionBar = supportActionBar

        actionBar!!.title = "2021-2022 Roster"

        actionBar.setDisplayHomeAsUpEnabled(true)


    }
}