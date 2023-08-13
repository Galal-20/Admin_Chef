package com.galal.adminchef.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.galal.adminchef.databinding.PendingOrdersBinding
import com.google.android.material.snackbar.Snackbar

class pendingAdapter(
    private val customerName:ArrayList<String>,
    private val quanOfOrder:ArrayList<String>,
    private val imageFoods:ArrayList<Int>,
    ):RecyclerView.Adapter<pendingAdapter.pendingViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pendingViewHolder {
        return pendingViewHolder(PendingOrdersBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = customerName.size

    override fun onBindViewHolder(holder: pendingViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class pendingViewHolder(private val binding: PendingOrdersBinding):RecyclerView.ViewHolder(binding.root) {
        private var isAccepted = false
        @SuppressLint("SetTextI18n")
        fun bind(position: Int) {

            binding.apply {
                NameCustomer.text = customerName[position]
                imageFood.setImageResource(imageFoods[position])
                numbers.text = quanOfOrder[position]

                acceptButton.apply {
                    if (!isAccepted){
                        text = "Accept"
                    }else{
                        text = "Dispatch"
                    }
                    setOnClickListener {
                        if (!isAccepted){
                            text = "Dispatch"
                            isAccepted = true
                            Snackbar.make(numbers,"Order is accepted",Snackbar.LENGTH_SHORT).show()
                        }else{
                            customerName.removeAt(adapterPosition)
                            notifyItemRemoved(adapterPosition)
                            Snackbar.make(numbers,"Order is dispatched",Snackbar.LENGTH_SHORT).show()

                        }
                    }

                }
            }
        }

    }
}