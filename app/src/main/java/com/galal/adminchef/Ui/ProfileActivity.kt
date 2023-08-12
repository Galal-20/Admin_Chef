package com.galal.adminchef.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.galal.adminchef.R
import com.galal.adminchef.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private val binding:ActivityProfileBinding by lazy {
        ActivityProfileBinding.inflate(layoutInflater)
    }
    val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){uri ->
        if (uri != null) binding.imageFood.setImageURI(uri)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }
        binding.imageFood.setOnClickListener {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }


    }
}