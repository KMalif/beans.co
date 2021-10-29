package com.khafidul_mualif.beansco.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.beansco.databinding.ListArticlesBinding
import com.khafidul_mualif.beansco.model.Article

class ArticleAdapter (private val listArticle : ArrayList<Article>, val listener : onArticleClick): RecyclerView.Adapter<ArticleAdapter.ArticleViewholder>() {

    inner class ArticleViewholder(val binding: ListArticlesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewholder {
        return ArticleViewholder(ListArticlesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ArticleViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listArticle[position].image)
                .into(holder.binding.ArticleImage)

            Title.text = listArticle[position].title
            Content.text = listArticle[position].content
        }
        holder.itemView.setOnClickListener {
            listener.onItemClick(listArticle[position])
        }
    }

    override fun getItemCount(): Int {
        return listArticle.size
    }
    interface onArticleClick{
        fun onItemClick(article: Article)
    }
}