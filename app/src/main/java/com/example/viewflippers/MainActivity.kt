package com.example.viewflippers

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewflippers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            binding.viewFlipper.startFlipping()
        }

        binding.btnStop.setOnClickListener{
            binding.viewFlipper.stopFlipping()
        }

        //text and color of the status bar
        supportActionBar?.title = "ViewFlipper"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF3700B3")))

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}