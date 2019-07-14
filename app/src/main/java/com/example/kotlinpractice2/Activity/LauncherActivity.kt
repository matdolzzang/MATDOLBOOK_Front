package com.example.kotlinpractice2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.example.kotlinpractice2.R

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        val launcherImage : ImageView = findViewById(R.id.launcher_img)
        launcherImage.setImageDrawable(getDrawable(R.drawable.loading_img))
        Handler().postDelayed(Runnable {
            val intent = Intent(this, NavHeaderMainActivity::class.java)
            startActivity(intent)
        },3000)

    }
}
