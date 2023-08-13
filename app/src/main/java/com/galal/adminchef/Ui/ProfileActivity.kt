package com.galal.adminchef.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
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

        bind()
        lock()




    }

    private fun bind(){
        binding.backButton.setOnClickListener { finish() }
        binding.imageFood.setOnClickListener {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }
        binding.editInformation.setOnClickListener {
            binding.imageFood.isEnabled = true
            binding.name.isEnabled = true
            binding.email.isEnabled = true
            binding.Address.isEnabled = true
            binding.phone.isEnabled = true
            binding.password.isEnabled = true
            binding.locationName.isEnabled = true
            binding.name.requestFocus()
        }
    }
    private fun lock(){
        binding.imageFood.isEnabled = false
        binding.name.isEnabled = false
        binding.email.isEnabled = false
        binding.Address.isEnabled = false
        binding.phone.isEnabled = false
        binding.password.isEnabled = false
        binding.locationName.isEnabled = false

    }
}