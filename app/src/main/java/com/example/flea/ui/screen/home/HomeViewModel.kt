package com.example.flea.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flea.data.models.Film
import com.example.flea.data.repository.FleaRepository
import com.example.flea.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val fleemRepository: FleaRepository,
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<Film>>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Film>>>
        get() = _uiState

    fun getAllFleaCart() {
        viewModelScope.launch {
            fleemRepository.getAllFLeaCart()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { flea ->
                    _uiState.value = UiState.Success(flea)
                }
        }
    }
}