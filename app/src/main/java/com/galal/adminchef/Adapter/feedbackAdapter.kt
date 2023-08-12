package com.galal.adminchef.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.galal.adminchef.databinding.FeedbackItemBinding

class feedbackAdapter(
    private val customerNameFeedbacks:ArrayList<String>,
    private val customerFeedbacks: ArrayList<String>
    ):RecyclerView.Adapter<feedbackAdapter.feedbackViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): feedbackViewHolder {
        return feedbackViewHolder((FeedbackItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)))
    }

    override fun getItemCount(): Int = customerNameFeedbacks.size

    override fun onBindViewHolder(holder: feedbackViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class feedbackViewHolder (private val binding:FeedbackItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                customerNameFeedback.text = customerNameFeedbacks[position]
                customerFeedback.text = customerFeedbacks[position]
            }
        }

    }
}