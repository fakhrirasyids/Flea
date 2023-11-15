package com.example.flea.ui.screen.detail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.flea.R
import com.example.flea.data.repository.FleaRepository
import com.example.flea.ui.ViewModelFactory
import com.example.flea.ui.theme.FleaTheme
import com.example.flea.utils.UiState

@Composable
fun DetailScreen(
    filmId: Long,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(
            FleaRepository.getInstance()
        )
    ),
    navigateBack: () -> Unit,
) {
    Scaffold { innerPadding ->
        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getFilmById(filmId)
                }

                is UiState.Success -> {
                    val data = uiState.data
                    Box(modifier = Modifier.padding(innerPadding)) {
                        DetailContent(
                            data.image,
                            data.title,
                            data.desc,
                            onBackClick = navigateBack
                        )
                    }
                }

                is UiState.Error -> {}
            }
        }
    }
}

@Composable
fun DetailContent(
    @DrawableRes image: Int,
    title: String,
    desc: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
) {

    Column(modifier = modifier) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(1f)
        ) {
            Box {
                Image(
                    painter = painterResource(image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .height(400.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp))
                )
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable { onBackClick() }
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.ExtraBold
                    ),
                )
                Text(
                    text = desc,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Justify,
                )
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(Color.LightGray)
        )
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun DetailContentPreview() {
    FleaTheme {
        DetailContent(
            R.drawable.hlbp,
            "CHECK",
            "Check Check",
            onBackClick = {}
        )
    }
}