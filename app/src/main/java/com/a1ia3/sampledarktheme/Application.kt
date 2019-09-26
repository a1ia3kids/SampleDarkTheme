package com.a1ia3.sampledarktheme

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class Application : Application() {
    override fun onCreate() {
        super.onCreate()

    }

    fun setNightMode(mode: Int) {
        AppCompatDelegate.setDefaultNightMode(mode)
    }
}