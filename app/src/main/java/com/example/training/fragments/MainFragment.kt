package com.example.training.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.training.MainActivityViewModel
import com.example.training.databinding.MainLayoutBinding

class MainFragment : Fragment() {
    private lateinit var binding: MainLayoutBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainLayoutBinding.inflate(inflater, container, false)
        viewModel = MainActivityViewModel()
        binding.button.setOnClickListener {
            binding.textView.text = viewModel.kiki.name
        }
        return binding.root

    }
}

