package com.galal.adminchef.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galal.adminchef.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.AddItem.setOnClickListener{
            Intent(this, AddItemActivity::class.java).also { startActivity(it) }
        }

        binding.AddAllItem.setOnClickListener {
            Intent(this, AddAllItemActivity::class.java).also { startActivity(it) }
        }

        binding.OutOfDel.setOnClickListener {
            Intent(this,OutOfDeliveryActivity::class.java).also { startActivity(it) }
        }

        binding.feedBackItem.setOnClickListener {
            Intent(this,FeedBackActivity::class.java).also { startActivity(it) }
        }

        binding.profile.setOnClickListener {
            Intent(this,ProfileActivity::class.java).also { startActivity(it) }
        }

        binding.logOut.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }


    }
}