package com.example.training

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.training.databinding.MainLayoutBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: MainLayoutBinding
    private lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = MainActivityViewModel()
        binding = MainLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            setText()
        }
    }

    private fun setText() {
        binding.textView.text = viewModel.kiki.name
    }
}