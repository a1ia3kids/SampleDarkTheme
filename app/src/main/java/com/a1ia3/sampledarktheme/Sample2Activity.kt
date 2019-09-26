package com.a1ia3.sampledarktheme

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * 任意に操作できる
 * 切り替えタイミングはActivityの再生成 or recreate()
 */
class Sample2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        // android:configChanges="uiMode"にしていると勝手には切り替わらない
        // 現在のモードを取得する
        when (newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_NO -> {
                Toast.makeText(this, "not NightMode", Toast.LENGTH_LONG).show()
            }
            Configuration.UI_MODE_NIGHT_YES -> {
                Toast.makeText(this, "NightMode", Toast.LENGTH_LONG).show()
            }
        }
        // 反映させたい場合下記コード
//        recreate()
    }
}