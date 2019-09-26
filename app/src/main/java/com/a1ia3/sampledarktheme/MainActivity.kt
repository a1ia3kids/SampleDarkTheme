package com.a1ia3.sampledarktheme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.button1
import kotlinx.android.synthetic.main.activity_main.button2
import kotlinx.android.synthetic.main.activity_main.button3
import kotlinx.android.synthetic.main.activity_main.button4
import kotlinx.android.synthetic.main.activity_main.button5
import kotlinx.android.synthetic.main.activity_main.text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        when (AppCompatDelegate.getDefaultNightMode()) {
            AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM -> {
                text.text = "Delegate: MODE_NIGHT_FOLLOW_SYSTEM"
            }
            AppCompatDelegate.MODE_NIGHT_YES -> {
                text.text = "Delegate: MODE_NIGHT_YES"
            }
            AppCompatDelegate.MODE_NIGHT_NO -> {
                text.text = "Delegate: MODE_NIGHT_NO"
            }
            AppCompatDelegate.MODE_NIGHT_AUTO -> {
                text.text = "Delegate: MODE_NIGHT_AUTO"
            }
        }
        initButton()
    }

    private fun initButton() {
        button1.setOnClickListener {
            startActivity(Intent(applicationContext, Sample1Activity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(applicationContext, Sample2Activity::class.java))
        }

        button3.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            recreate()
        }

        button4.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            recreate()
        }

        button5.setOnClickListener {
            // これは設定から変えないと反映されない？
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
            recreate()
        }
    }

}
