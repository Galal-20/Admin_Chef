package com.galal.adminchef.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.galal.adminchef.Adapter.AddAllAdapter
import com.galal.adminchef.R
import com.galal.adminchef.databinding.ActivityAddAllItemBinding

class AddAllItemActivity : AppCompatActivity() {
    private val binding:ActivityAddAllItemBinding by lazy {
        ActivityAddAllItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        val menuFoodName = listOf(
            "Burger","chicken","salmon",
            "Burger","chicken","salmon",)

        val menuPrice = listOf(
            "100 $", "200 $", "300 $",
            "100 $", "200 $", "300 $",)

        val menuImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu3
        )

        val adapter = AddAllAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuPrice),
            ArrayList(menuImage)
        )

        binding.menuRecycleView.layoutManager = LinearLayoutManager(this)
        binding.menuRecycleView.adapter = adapter
    }
}