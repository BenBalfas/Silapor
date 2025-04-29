package com.example.silapor.ui.screen.bookingDetail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.size
import androidx.compose.ui.tooling.preview.Preview
import com.example.silapor.ui.screen.favorite.FavoriteScreen


@Composable
fun BookingDetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Rincian",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0D65A8))
                .padding(vertical = 16.dp),
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        DetailItem(title = "Nama:", value = "Enggal Damang")

        Spacer(modifier = Modifier.height(12.dp))

        DetailItem(title = "Total harga:", value = "200.000")

        Spacer(modifier = Modifier.height(12.dp))

        DetailItem(title = "Lapangan:", value = "Inspire arena/\n23-04-25/17:00")

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Status pembayaran:",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF0D1B2A)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .background(Color.Red, shape = RoundedCornerShape(50))
                .padding(horizontal = 32.dp, vertical = 8.dp)
        ) {
            Text(
                text = "Belum dibayar",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Bukti pembayaran:",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF0D1B2A)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = { /* Upload bukti pembayaran */ },
            border = BorderStroke(1.dp, Color(0xFF0D1B2A)),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF0D1B2A))
        ) {
            Icon(
                imageVector = Icons.Default.Image,
                contentDescription = "Upload",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Kirimkan bukti pembayaran")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Tombol Booking
        Button(
            onClick = { /* Aksi Booking */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0D1B2A)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Booking",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Booking", fontSize = 16.sp)
        }
    }
}

@Composable
fun DetailItem(title: String, value: String) {
    Column(horizontalAlignment = Alignment.Start) {
        Text(
            text = title,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color(0xFF0D1B2A)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(50))
                .border(1.dp, Color(0xFF0D1B2A), shape = RoundedCornerShape(50))
                .padding(horizontal = 24.dp, vertical = 12.dp)
        ) {
            Text(
                text = value,
                fontSize = 16.sp,
                color = Color(0xFF0D1B2A)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFavoriteScreen() {
    val dummyData = listOf(
        BookingItem("Enggal Damang", "200.000", "Inspire Arena/\n23-04-25/17:00", "Belum dibayar", isFavorite = true),
        BookingItem("Rizky Ramadhan", "250.000", "GOR Cempaka/\n23-05-01/15:00", "Sudah dibayar", isFavorite = false),
        BookingItem("Putra Dwi", "300.000", "Futsal 88/\n23-05-03/19:00", "Belum dibayar", isFavorite = true)
    )
    FavoriteScreen(favoriteList = dummyData)
}