package com.example.training.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.training.MainActivityViewModel
import com.example.training.R
import com.example.training.databinding.MainLayoutBinding

class MainFragment : Fragment(R.layout.main_layout) {
    private lateinit var binding: MainLayoutBinding
    private var viewModel = MainActivityViewModel()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = MainLayoutBinding.bind(view).apply {
            textView.text = viewModel.kiki.name
            button.setOnClickListener {
                textView.text = when (textView.text) {
                    viewModel.kiki.name -> viewModel.meatbol.name
                    else -> viewModel.kiki.name
                }
            }
        }
    }

}

