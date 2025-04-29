package com.example.silapor.ui.screen.history

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HistoryScreen(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(0) {
            HistoryItem()
        }
    }
}

@Composable
fun HistoryItem(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Tanggal", // Placeholder
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(color = Color.Gray, shape = RoundedCornerShape(50))
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Status", // Placeholder
                        color = Color.White,
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Nama Arena", // Placeholder
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black
                )
                Text(
                    text = "Rp0", // Placeholder
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview
@Composable
private fun HistoryPreview() {
    MaterialTheme {
        HistoryItem()
    }
}