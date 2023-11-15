package com.example.flea.ui.screen.aboutme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flea.R

@Composable
fun AboutMeScreen(
    navigateBack: () -> Unit,
) {
    Scaffold(
        topBar = {
            AboutMeAppBar(navigateBack)
        },
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.arwinda),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(250.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text = "Arwinda Salsabilla N",
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                text = "arwindasalsa21@gmail.com",
                fontWeight = FontWeight.Light,
                fontSize = 20.sp
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutMeAppBar(
    navigateBack: () -> Unit,
) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { navigateBack() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
        title = {
            Text(text = "About Me",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary)
        }
    )
}