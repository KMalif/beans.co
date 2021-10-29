package com.khafidul_mualif.beansco.util

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class DisableNightMode : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}