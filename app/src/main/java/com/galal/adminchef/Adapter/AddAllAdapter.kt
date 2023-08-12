package com.galal.adminchef.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.galal.adminchef.databinding.MenuItemBinding

class AddAllAdapter (
    private val menuItemName:ArrayList<String>,
    private val menuItemPrice:ArrayList<String>,
    private val menuItemImage:ArrayList<Int>)
    :RecyclerView.Adapter<AddAllAdapter.AddAllViewHolder>(){

    private val itemQuantity= IntArray(menuItemName.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddAllViewHolder {
        return AddAllViewHolder(
            MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun getItemCount(): Int = menuItemName.size

    override fun onBindViewHolder(holder: AddAllViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class AddAllViewHolder (private val binding: MenuItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                foodNameItem.text= menuItemName[position]
                priceFood.text = menuItemPrice[position]
                foodImageView.setImageResource(menuItemImage[position])
                textNumber.text= itemQuantity[position].toString()

                minusButton.setOnClickListener {
                    minuQ(position)
                }
                plusButton.setOnClickListener {
                    plusQ(position)
                }
                imageDelete.setOnClickListener {
                    deletItem(position)
                }
            }
        }

        private fun deletItem(position: Int) {
            menuItemName.removeAt(position)
            menuItemImage.removeAt(position)
            menuItemPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, menuItemName.size)
        }

        private fun plusQ(position: Int) {
            if (itemQuantity[position]<10){
                itemQuantity[position]++
                binding.textNumber.text = itemQuantity[position].toString()
            }
        }

        private fun minuQ(position: Int) {
            if (itemQuantity[position]>1){
                itemQuantity[position]--
                binding.textNumber.text = itemQuantity[position].toString()
            }
        }

    }


}