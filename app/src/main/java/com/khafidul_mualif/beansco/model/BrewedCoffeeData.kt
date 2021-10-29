package com.khafidul_mualif.beansco.model

import com.example.beansco.R

object BrewedCoffeeData {

    private val thumbnail = arrayOf(
        R.drawable.brew0,
        R.drawable.brew2,
        R.drawable.brew3,
        R.drawable.brew4,
        R.drawable.brew5,
        R.drawable.brew6,
        R.drawable.brew7,
        R.drawable.brew8,
        R.drawable.brew9,
        R.drawable.brew10

    )

    private val title = arrayOf(
        "Americano",
        "Cold Brew",
        "Iced Coffee",
        "Cappucino",
        "Creamy",
        "Sweet Coffee",
        "Fresh Brew",
        "Coffee tonic",
        "Milky Brew",
        "Latte art"
    )


    val listBrewed : ArrayList<BrewedCoffee>
        get() {
            val list = arrayListOf<BrewedCoffee>()
            for (position in title.indices){
                val brewed = BrewedCoffee()
                brewed.title = title[position]
                brewed.thumbnail = thumbnail[position]
                list.add(brewed)
            }
            return list
        }

}