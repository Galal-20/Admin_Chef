package com.galal.adminchef.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.galal.adminchef.databinding.ActivitySplashMainBinding

class SplashMainActivity : AppCompatActivity() {
    private val binding:ActivitySplashMainBinding by lazy {
        ActivitySplashMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            Intent(this, LoginActivity::class.java).also { startActivity(it) }
            finish()
        },3000)
    }
}