package com.galal.adminchef.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galal.adminchef.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private val binding:ActivitySignUpBinding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.CreateAccount.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
        binding.Already.setOnClickListener {
            Intent(this,LoginActivity::class.java).also {
                startActivity(it)
                finish()}
        }
    }
}