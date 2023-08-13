package com.galal.adminchef.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.galal.adminchef.databinding.ActivityAddItemBinding

class AddItemActivity : AppCompatActivity() {
    private val binding: ActivityAddItemBinding by lazy { ActivityAddItemBinding.inflate(layoutInflater) }
    private val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia())
    { uri ->
        if (uri != null) binding.imageFood.setImageURI(uri)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        bind()
    }

    private fun bind() {
        binding.imageItem.setOnClickListener {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }
        binding.backButton.setOnClickListener { finish() }

        binding.AddButton.setOnClickListener {
            Intent(this,AddAllItemActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }



    }



}

