package com.khafidul_mualif.beansco.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.beansco.databinding.ListSpeciesBinding
import com.khafidul_mualif.beansco.model.Species

class SpeciesAdapter (private val listSpecies : ArrayList<Species>, val listener : OnVariantClick) : RecyclerView.Adapter<SpeciesAdapter.SpeciesViewholder>() {

    inner class SpeciesViewholder(val binding: ListSpeciesBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpeciesViewholder {
        return SpeciesViewholder(ListSpeciesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SpeciesViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listSpecies[position].image)
                .into(holder.binding.SpeciesImage)

            SpeciesName.text = listSpecies[position].name
        }
        holder.itemView.setOnClickListener {
            listener.onItemClick(listSpecies[position])
        }
    }

    override fun getItemCount(): Int {
        return listSpecies.size
    }

    interface OnVariantClick{
        fun onItemClick(species: Species)
    }
}