package com.example.training.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.training.MainActivityViewModel
import com.example.training.R
import com.example.training.databinding.MainLayoutBinding

class MainFragment : Fragment(R.layout.main_layout) {
    private lateinit var binding: MainLayoutBinding
    private var viewModel = MainActivityViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toast = Toast.makeText(requireActivity(), "Button Clicked", Toast.LENGTH_SHORT)
        binding = MainLayoutBinding.bind(view).apply {
            button.setOnClickListener {
                toast.show()
                textView.text = viewModel.getNames(textView.text.toString())
            }
        }

    }
}

