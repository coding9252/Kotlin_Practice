package com.android.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding = ActivityMainBinding.inflate(layoutInflater)
        // val view = binding.root
        // setContentView(view)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}