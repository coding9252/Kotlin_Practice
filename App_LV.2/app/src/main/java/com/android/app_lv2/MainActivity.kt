package com.android.app_lv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.myButton)

        btn.setOnClickListener {
            val tv = findViewById<TextView>(R.id.myTextView)

            tv.text = "버튼이 눌렸습니다."
        }
    }
}