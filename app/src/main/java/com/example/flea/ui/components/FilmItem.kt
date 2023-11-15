package com.example.flea.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flea.R
import com.example.flea.ui.theme.FleaTheme

@Composable
fun FilmItem(
    image: Int,
    title: String,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(image),
                contentScale = ContentScale.Crop,
                contentDescription = title,
                modifier = Modifier
                    .size(180.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold)
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun RewardItemPreview() {
    FleaTheme {
        FilmItem(R.drawable.hlbp, "cek")
    }
}