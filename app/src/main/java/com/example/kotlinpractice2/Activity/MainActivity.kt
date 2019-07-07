package com.example.kotlinpractice2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.kotlinpractice2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolBar:Toolbar = findViewById(R.id.header_menu_toolbar)
        setSupportActionBar(toolBar)

        val menu_ImageView : ImageView= findViewById(R.id.header_menu_btn)
        menu_ImageView.setOnClickListener {
            val intent = Intent(this, NavHeaderMainActivity::class.java)
            startActivity(intent)
        }

    }
}
