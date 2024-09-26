package com.example.training

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var kiki: Cats = Cats("Kiki", "Domestic Shorthair", "Dilly", 8)
    var meatbol: Cats = Cats("Meatbol", "Domestic Shorthair", "Drew", 8 )
}