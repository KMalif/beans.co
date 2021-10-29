package com.khafidul_mualif.beansco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.beansco.databinding.ActivitySpeciesBinding
import com.example.beansco.databinding.ListSpeciesBinding

class SpeciesActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpeciesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpeciesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        showDetailVariant()
        backButtonPressed()
    }

    fun backButtonPressed(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    fun showDetailVariant(){
        val image = intent.getIntExtra("variantImage", 0)
        val variantName = intent.getStringExtra("variantName")
        val variantDesc = intent.getStringExtra("variantDesc")

        Glide.with(this)
            .load(image)
            .into(binding.VariantImage)
        binding.VariantName.text = variantName
        binding.VariantDesc.text = variantDesc
    }
}