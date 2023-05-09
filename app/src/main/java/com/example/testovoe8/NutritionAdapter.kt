package com.example.testovoe8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NutritionAdapter (val nutritions: List<Nutrition>) : RecyclerView.Adapter<NutritionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.nutrition_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nutrition = nutritions[position]
        holder.textViewPriem.text = nutrition.priem
        holder.textViewFood.text = nutrition.food
        holder.textViewKcal.text = nutrition.kcal
        // Load image using a library like Glide or Picasso
        Glide.with(holder.itemView.context).load(nutrition.photo).into(holder.imageFood)
    }

    override fun getItemCount(): Int {
        return nutritions.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewPriem: TextView = itemView.findViewById(R.id.textViewPriem)
        val textViewFood: TextView = itemView.findViewById(R.id.textViewFood)
        val textViewKcal: TextView = itemView.findViewById(R.id.textViewKcal)
        val imageFood: ImageView = itemView.findViewById(R.id.imageFood)
    }
}