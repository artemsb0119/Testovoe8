package com.example.testovoe8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkoutAdapter (val workouts: List<Workout>) : RecyclerView.Adapter<WorkoutAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.workout_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val workout = workouts[position]
        holder.textViewNumber.text = (position+1).toString()
        holder.textViewTrain.text = workout.train
        holder.textViewKol.text = workout.kol
    }

    override fun getItemCount(): Int {
        return workouts.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewNumber: TextView = itemView.findViewById(R.id.textViewNumber)
        val textViewTrain: TextView = itemView.findViewById(R.id.textViewTrain)
        val textViewKol: TextView = itemView.findViewById(R.id.textViewKol)
    }
}