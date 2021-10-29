package com.khafidul_mualif.beansco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.beansco.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        showDetailArticle()
        btnBackPressed()
    }

    private fun btnBackPressed(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun showDetailArticle(){
        val image = intent.getIntExtra("articleImage", 0)
        val title = intent.getStringExtra("articleTitle")
        val content = intent.getStringExtra("articleContent")

            Glide.with(this)
            .load(image)
            .into(binding.ArticleImage)

        binding.TVTitle.text = title
        binding.ArticleContent.text = content
    }
}