package com.example.silapor.ui.screen.home


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _selectedCity = MutableStateFlow<Int?>(null)
    val selectedCity: StateFlow<Int?> = _selectedCity

    private val _selectedSport = MutableStateFlow<String?>(null)
    val selectedSport: StateFlow<String?> = _selectedSport

    fun setSelectedCity(cityId: Int) {
        _selectedCity.value = cityId
    }

    fun setSelectedSport(sport: String) {
        _selectedSport.value = sport
    }
}