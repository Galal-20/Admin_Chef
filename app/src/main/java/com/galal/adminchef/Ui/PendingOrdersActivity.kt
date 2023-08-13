package com.galal.adminchef.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.galal.adminchef.Adapter.pendingAdapter
import com.galal.adminchef.R
import com.galal.adminchef.databinding.ActivityPendingOrdersBinding

class PendingOrdersActivity : AppCompatActivity() {
    private val binding:ActivityPendingOrdersBinding by lazy {
        ActivityPendingOrdersBinding.inflate(layoutInflater)
    }
    private val customerName = listOf(
        "Ahmed","Mohamed","salem",
        "Salma","Maged","Yaser")

    private val qOn = listOf(
        "2", "4", "6",
        "8", "10", "12")

    private val foodImage = listOf(
        R.drawable.menu1,
        R.drawable.menu2,
        R.drawable.menu3,
        R.drawable.menu4,
        R.drawable.menu5,
        R.drawable.menu3
    )

    private val adapter = pendingAdapter(
        ArrayList(customerName),
        ArrayList(qOn),
        ArrayList(foodImage)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        bind()

    }

    private fun bind() {
        binding.recyclePending.layoutManager = LinearLayoutManager(this)
        binding.recyclePending.adapter = adapter
        binding.backButton.setOnClickListener { finish() }
    }
}