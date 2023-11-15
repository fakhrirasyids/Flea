package com.example.flea.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.flea.data.repository.FleaRepository
import com.example.flea.ui.screen.detail.DetailViewModel
import com.example.flea.ui.screen.home.HomeViewModel

class ViewModelFactory(private val fleaRepository: FleaRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                return HomeViewModel(fleaRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                return DetailViewModel(fleaRepository) as T
            }
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}