package com.galal.adminchef.Adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.galal.adminchef.databinding.OutOfDeliveryItemBinding

class outOfDeliveryAdapter(
    private val customerNames:ArrayList<String>,
    private val moneyState:ArrayList<String>
    ):RecyclerView.Adapter<outOfDeliveryAdapter.outOfDeliveryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): outOfDeliveryViewHolder {
        return outOfDeliveryViewHolder(OutOfDeliveryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int = customerNames.size

    override fun onBindViewHolder(holder: outOfDeliveryViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class outOfDeliveryViewHolder(private val binding: OutOfDeliveryItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                customerName.text = customerNames[position]
                notReceived.text = moneyState[position]

                val colorMap = mapOf(
                    "received" to Color.GREEN,
                    "notReceived" to Color.RED,
                    "pending" to Color.GRAY
                )
                notReceived.setTextColor(colorMap[moneyState[position]]?:Color.BLACK)
                statusColor.backgroundTintList = ColorStateList.valueOf(colorMap[moneyState[position]]?:Color.BLACK)

            }
        }

    }
}