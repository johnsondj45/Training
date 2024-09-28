package com.example.training

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var kiki: Cats = Cats("Kiki", "Domestic Shorthair", "Dilly", 8)
    var meatbol: Cats = Cats("Meatbol", "Domestic Shorthair", "Drew", 8)
    fun getNames(name: String): String {
        return if (name == kiki.name) {
            meatbol.name
        } else {
            kiki.name
        }
    }
}
