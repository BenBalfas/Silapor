package com.example.silapor.ui.screen.booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.silapor.model.Field
import com.google.accompanist.flowlayout.FlowRow


@Composable
fun BookingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Pilih Tanggal",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        DatePickerDropdown()

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(sampleFields) { field ->
                FieldCard(field)
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
fun DatePickerDropdown() {
    var expanded by remember { mutableStateOf(false) }
    var selectedDate by remember { mutableStateOf("Pilih Tanggal") }

    Box {
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(selectedDate)
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Dropdown"
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            listOf("26 April", "27 April", "28 April").forEach { date ->
                DropdownMenuItem(
                    text = { Text(date) },
                    onClick = {
                        selectedDate = date
                        expanded = false
                    }
                )
            }
        }
    }
}


@Composable
fun FieldCard(field: Field) {
    val times = remember(field.openHour, field.closeHour) {
        generateTimes(field.openHour, field.closeHour)
    }
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Box {
                Image(
                    painter = painterResource(id = field.imageRes),
                    contentDescription = "Lapangan",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                )
                IconButton(
                    onClick = { /* Handle favorite */ },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .background(Color.White, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Favorite"
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = field.name, style = MaterialTheme.typography.titleMedium)
                Text(text = "Rp.${field.price}", style = MaterialTheme.typography.titleMedium)
            }

            Spacer(modifier = Modifier.height(8.dp))

            FlowRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                mainAxisSpacing = 8.dp,
                crossAxisSpacing = 8.dp
            ) {
                times.forEach { time ->
                    TimeSlotButton(time)
                }
            }
        }
    }
}

@Composable
fun TimeSlotButton(time: String) {
    Button(
        onClick = { /* Handle select time */ },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF003366)),
        shape = RoundedCornerShape(12.dp),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
        modifier = Modifier.height(32.dp)
    ) {
        Text(text = time, color = Color.White, style = MaterialTheme.typography.bodySmall)
    }
}

fun generateTimes(openHour: Int, closeHour: Int): List<String> {
    return (openHour..closeHour).map { hour ->
        String.format("%02d:00", hour)
    }
}