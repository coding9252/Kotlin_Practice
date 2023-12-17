package com.android.ui_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_views)

        val btn = findViewById<Button>(R.id.submit_button)

        btn.setOnClickListener {
            Toast.makeText(this, "Submitted Successfully", Toast.LENGTH_SHORT).show()
        }
    }

//    fun doAction(v:View) {
//        Toast.makeText(getApplicationContext(), "Submitted Successfully", Toast.LENGTH_SHORT).show()
//    }
}