//package com.example.silapor.ui.screen.favorite
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.silapor.ui.screen.bookingDetail.DetailItem
//
//@Composable
//fun FavoriteScreen(
//    favoriteList: List<BookingItem>
//) {
//    val filteredFavorites = favoriteList.filter { it.isFavorite }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//            .padding(horizontal = 24.dp, vertical = 16.dp)
//    ) {
//        Text(
//            text = "Favorit",
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color(0xFF0D65A8))
//                .padding(vertical = 16.dp),
//            color = Color.White,
//            textAlign = TextAlign.Center
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        if (filteredFavorites.isEmpty()) {
//            Box(
//                modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = "Belum ada favorit.",
//                    fontSize = 16.sp,
//                    color = Color.Gray
//                )
//            }
//        } else {
//            LazyColumn(
//                verticalArrangement = Arrangement.spacedBy(16.dp)
//            ) {
//                items(filteredFavorites) { item ->
//                    FavoriteItemCard(item)
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun FavoriteItemCard(item: BookingItem) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White, RoundedCornerShape(16.dp))
//            .border(1.dp, Color.LightGray, RoundedCornerShape(16.dp))
//            .padding(16.dp)
//    ) {
//        DetailItem(title = "Nama:", value = item.name)
//        Spacer(modifier = Modifier.height(12.dp))
//        DetailItem(title = "Total harga:", value = item.price)
//        Spacer(modifier = Modifier.height(12.dp))
//        DetailItem(title = "Lapangan:", value = item.fieldInfo)
//        Spacer(modifier = Modifier.height(12.dp))
//
//        Text(
//            text = "Status pembayaran:",
//            fontSize = 16.sp,
//            fontWeight = FontWeight.Medium,
//            color = Color(0xFF0D1B2A)
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        val statusColor = if (item.paymentStatus == "Belum dibayar") Color.Red else Color(0xFF4CAF50)
//
//        Box(
//            modifier = Modifier
//                .background(statusColor, shape = RoundedCornerShape(50))
//                .padding(horizontal = 32.dp, vertical = 8.dp)
//        ) {
//            Text(
//                text = item.paymentStatus,
//                color = Color.White,
//                fontWeight = FontWeight.Bold,
//                fontSize = 16.sp
//            )
//        }
//    }
//}
//
//data class BookingItem(
//    val name: String,
//    val price: String,
//    val fieldInfo: String,
//    val paymentStatus: String,
//    val isFavorite: Boolean
//)