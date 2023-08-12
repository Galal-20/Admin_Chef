package com.galal.adminchef.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.galal.adminchef.Adapter.outOfDeliveryAdapter
import com.galal.adminchef.R
import com.galal.adminchef.databinding.ActivityOutOfDeliveryBinding

class OutOfDeliveryActivity : AppCompatActivity() {
    private val bindind:ActivityOutOfDeliveryBinding by  lazy {
        ActivityOutOfDeliveryBinding.inflate(layoutInflater)
    }
    lateinit var customerName:ArrayList<String>
    lateinit var moneyState:ArrayList<String>
    lateinit var adapter: outOfDeliveryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindind.root)

        bindind.backButton.setOnClickListener { finish() }

        customerName = arrayListOf("Ahmed","Mohamed","Fahmy")
        moneyState = arrayListOf("received","notReceived","pending")

        adapter = outOfDeliveryAdapter(customerName,moneyState)
        bindind.menuRecycleView.layoutManager = LinearLayoutManager(this)
        bindind.menuRecycleView.adapter = adapter

    }
}