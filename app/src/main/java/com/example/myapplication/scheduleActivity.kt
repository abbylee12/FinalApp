package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class scheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        val actionBar = supportActionBar

        actionBar!!.title = "2021-2022 Schedule"

        actionBar.setDisplayHomeAsUpEnabled(true)


    }
}