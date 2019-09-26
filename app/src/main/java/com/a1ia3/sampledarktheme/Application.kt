package com.a1ia3.sampledarktheme

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}