package com.example.flea.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flea.data.models.Film
import com.example.flea.data.repository.FleaRepository
import com.example.flea.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val fleaRepository: FleaRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<Film>> =
        MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<Film>>
        get() = _uiState

    fun getFilmById(filmId: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(fleaRepository.getFilmById(filmId))
        }
    }
}