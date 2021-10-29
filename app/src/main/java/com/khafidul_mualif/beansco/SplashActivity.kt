package com.khafidul_mualif.beansco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.beansco.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

    }

    override fun onStart() {
        super.onStart()
        splashScreen()
    }

    fun splashScreen(){
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java)).also { finish() }
        }, 2000)
    }
}