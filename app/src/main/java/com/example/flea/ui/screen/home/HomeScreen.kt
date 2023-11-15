package com.example.flea.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.flea.data.models.Film
import com.example.flea.data.repository.FleaRepository
import com.example.flea.ui.ViewModelFactory
import com.example.flea.ui.components.CustomAppBar
import com.example.flea.ui.components.FilmItem
import com.example.flea.utils.UiState

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(FleaRepository.getInstance())
    ),
    navigateToDetail: (Long) -> Unit,
    navigateToAboutMe: () -> Unit,
) {
    Scaffold(
        topBar = { CustomAppBar(navigateToAboutMe) },
    ) { innerPadding ->
        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAllFleaCart()
                }

                is UiState.Success -> {
                    Box(modifier = Modifier.padding(innerPadding)) {
                        HomeContent(
                            fleemCartList = uiState.data,
                            navigateToDetail = navigateToDetail,
                        )
                    }
                }

                is UiState.Error -> {}
            }
        }
    }
}

@Composable
fun HomeContent(
    fleemCartList: List<Film>,
    navigateToDetail: (Long) -> Unit,
) {
    LazyColumn(
    ) {
        items(items = fleemCartList, itemContent = { item ->
            FilmItem(
                image = item.image,
                title = item.title,
                modifier = Modifier.clickable {
                    navigateToDetail(item.id)
                }
            )
        })
    }
}