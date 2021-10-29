package com.khafidul_mualif.beansco.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.beansco.databinding.ListBrewedBinding
import com.khafidul_mualif.beansco.model.BrewedCoffee

class BrewedAdapter(private val listBrewed : ArrayList<BrewedCoffee>) : RecyclerView.Adapter<BrewedAdapter.BrewViewholder>() {

    inner class BrewViewholder(val binding : ListBrewedBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrewViewholder {
        return BrewViewholder(ListBrewedBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BrewViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listBrewed[position].thumbnail)
                .into(holder.binding.Tumbnail)

            Title.text = listBrewed[position].title
        }
    }

    override fun getItemCount(): Int {
        return listBrewed.size
    }
}