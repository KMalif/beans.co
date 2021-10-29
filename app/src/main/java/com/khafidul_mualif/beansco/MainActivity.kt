package com.khafidul_mualif.beansco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.khafidul_mualif.beansco.adapter.ArticleAdapter
import com.khafidul_mualif.beansco.adapter.BrewedAdapter
import com.khafidul_mualif.beansco.adapter.SpeciesAdapter
import com.example.beansco.databinding.ActivityMainBinding
import com.example.beansco.model.*
import com.khafidul_mualif.beansco.model.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var articleAdapter : ArticleAdapter
    private lateinit var speciesAdapter : SpeciesAdapter
    private lateinit var brewedAdapter : BrewedAdapter
    private var listArticle : ArrayList<Article> = arrayListOf()
    private var listSpecies : ArrayList<Species> = arrayListOf()
    private var listBrewed : ArrayList<BrewedCoffee> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        showArticleToRv()
        showSpeciesToRv()
        showBrewedCoffeeRV()
    }

    fun showArticleToRv(){
        listArticle.addAll(ArticleData.listArticles)
        articleAdapter = ArticleAdapter(listArticle, object : ArticleAdapter.onArticleClick{
            override fun onItemClick(article: Article) {
                startActivity(Intent(this@MainActivity, ArticleActivity::class.java).apply {
                    putExtra("articleTitle", article.title)
                    putExtra("articleImage", article.image)
                    putExtra("articleContent", article.content)
                })
            }
        })

        binding.RVArticles.apply {
            adapter = articleAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }

    fun showSpeciesToRv(){
        listSpecies.addAll(SpeciesData.listSpecies)
        speciesAdapter = SpeciesAdapter(listSpecies, object : SpeciesAdapter.OnVariantClick{
            override fun onItemClick(species: Species) {
                startActivity(Intent(this@MainActivity, SpeciesActivity::class.java).apply {
                    putExtra("variantImage", species.image)
                    putExtra("variantName", species.name)
                    putExtra("variantDesc", species.description)
                })
            }
        })

        binding.RVSpecies.apply {
            adapter = speciesAdapter
            val linearManager = LinearLayoutManager(this@MainActivity)
            linearManager.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = linearManager
        }
    }

    fun showBrewedCoffeeRV(){
        listBrewed.addAll(BrewedCoffeeData.listBrewed)
        brewedAdapter = BrewedAdapter(listBrewed)
        binding.RVBrewed.apply {
            adapter = brewedAdapter
            val lm = GridLayoutManager(this@MainActivity,2 )
            layoutManager = lm
        }
    }
}