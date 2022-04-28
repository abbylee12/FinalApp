package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class infoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val actionBar = supportActionBar

        actionBar!!.title = "Player Information"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val pla1: Button = findViewById(R.id.pla1)
        pla1.setOnClickListener {
            val intent = Intent(this, player1Info::class.java)
            startActivity(intent)
        }

        val pla2: Button = findViewById(R.id.pla2)
        pla2.setOnClickListener {
            val intent = Intent(this, player2Info::class.java)
            startActivity(intent)
        }

        val pla3: Button = findViewById(R.id.pla3)
        pla3.setOnClickListener {
            val intent = Intent(this, player3Info::class.java)
            startActivity(intent)
        }

        val pla4: Button = findViewById(R.id.pla4)
        pla4.setOnClickListener {
            val intent = Intent(this, player4Info::class.java)
            startActivity(intent)
        }

        val pla5: Button = findViewById(R.id.pla5)
        pla5.setOnClickListener {
            val intent = Intent(this, player5Info::class.java)
            startActivity(intent)
        }

        val pla6: Button = findViewById(R.id.pla6)
        pla6.setOnClickListener {
            val intent = Intent(this, player6Info::class.java)
            startActivity(intent)
        }

        val pla7: Button = findViewById(R.id.pla7)
        pla7.setOnClickListener {
            val intent = Intent(this, player7Info::class.java)
            startActivity(intent)
        }

        val pla8: Button = findViewById(R.id.pla8)
        pla8.setOnClickListener {
            val intent = Intent(this, player8Info::class.java)
            startActivity(intent)
        }

        val pla9: Button = findViewById(R.id.pla9)
        pla9.setOnClickListener {
            val intent = Intent(this, player9Info::class.java)
            startActivity(intent)
        }

        val pla10: Button = findViewById(R.id.pla10)
        pla10.setOnClickListener {
            val intent = Intent(this, player10Info::class.java)
            startActivity(intent)
        }

        val pla11: Button = findViewById(R.id.pla11)
        pla11.setOnClickListener {
            val intent = Intent(this, player11Info::class.java)
            startActivity(intent)
        }

        val pla12: Button = findViewById(R.id.pla12)
        pla12.setOnClickListener {
            val intent = Intent(this, player12Info::class.java)
            startActivity(intent)
        }

        val pla13: Button = findViewById(R.id.pla13)
        pla13.setOnClickListener {
            val intent = Intent(this, player13Info::class.java)
            startActivity(intent)
        }

        val pla14: Button = findViewById(R.id.pla14)
        pla14.setOnClickListener {
            val intent = Intent(this, player14Info::class.java)
            startActivity(intent)
        }

        val pla15: Button = findViewById(R.id.pla15)
        pla15.setOnClickListener {
            val intent = Intent(this, player15Info::class.java)
            startActivity(intent)
        }

        val pla16: Button = findViewById(R.id.pla16)
        pla16.setOnClickListener {
            val intent = Intent(this, player16Info::class.java)
            startActivity(intent)
        }


    }
}