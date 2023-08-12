package com.galal.adminchef.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.galal.adminchef.Adapter.feedbackAdapter
import com.galal.adminchef.R
import com.galal.adminchef.databinding.ActivityFeedBackBinding

class FeedBackActivity : AppCompatActivity() {
    private val binding:ActivityFeedBackBinding by lazy {
        ActivityFeedBackBinding.inflate(layoutInflater)
    }
    private lateinit var customerName:ArrayList<String>
    private lateinit var customerFeedback:ArrayList<String>
    private lateinit var adapter: feedbackAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        customerName = arrayListOf("Ahmed", "Mohamed", "Fahmy")
        customerFeedback = arrayListOf(
            "I recently dined at Restaurant Chef and wanted to share my feedback about the food. Overall, I had a positive experience, but I believe there are a few areas that could be improved to elevate the dining experience even further.",
            "I want to commend the chef for the creativity and presentation of the dishes. The appetizers, in particular, were outstanding.",
            "The crispy calamari was perfectly cooked and had a delightful crunch, and the dipping sauce complemented it well. The chicken skewers were tender and flavorful, a true highlight of the meal.")

        adapter = feedbackAdapter(customerName,customerFeedback)
        binding.menuRecycleView.layoutManager = LinearLayoutManager(this)
        binding.menuRecycleView.adapter = adapter
    }

}