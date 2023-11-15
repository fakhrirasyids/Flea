package com.example.flea.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(
    navigateToAboutMe: () -> Unit,
) {
    TopAppBar(
        title = {
            Text(
                text = "Flea",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.ExtraBold,
                color = lightColorScheme().primary
            )
        },
        actions = {
            IconButton(onClick = { navigateToAboutMe() }) {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "About Me")
            }
        }
    )
}