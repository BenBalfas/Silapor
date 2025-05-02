//package com.example.silapor.ui.screen.home
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.foundation.lazy.grid.items
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowDropDown
//import androidx.compose.material.icons.filled.CheckCircle
//import androidx.compose.material.icons.filled.KeyboardArrowUp
//import androidx.compose.material3.Button
//import androidx.compose.material3.DropdownMenu
//import androidx.compose.material3.DropdownMenuItem
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.viewmodel.compose.viewModel
//import coil.compose.AsyncImage
//import com.example.silapor.R
//import com.example.silapor.di.Injection
//import com.example.silapor.model.City
//import com.example.silapor.model.DummyFieldData
//import com.example.silapor.ui.ViewModelFactory
//import com.example.silapor.ui.theme.SilaporTheme
//
//@Composable
//fun HomeScreen(
//    viewModel: HomeViewModel = viewModel(
//        factory = ViewModelFactory(Injection.provideRepository())
//    ),
//    navigateToFieldList: (String) -> Unit,
//    ) {
//    val selectedSport by viewModel.selectedSport.collectAsState()
//    val selectedCity by viewModel.selectedCity.collectAsState()
//
//
//    HomeContent(
//        selectedCity = selectedCity!!,
//        selectedSport = selectedSport,
//        onCitySelected = { viewModel.setSelectedCity(it) },
//        onSportSelected = { viewModel.setSelectedSport(it) },
//        onSearchClicked = {
//            if (selectedCity != null && selectedSport!!.isNotEmpty()) {
//                navigateToFieldList(selectedCity!!.name)
//            }
//        }
//    )
//}
//
//@Composable
//fun HomeContent(
//    modifier: Modifier = Modifier,
//    cityList: List<City>,
//    selectedCity: City,
//    selectedSport: String?,
//    onCitySelected: (City) -> Unit,
//    onSportSelected: (String) -> Unit,
//    onSearchClicked: () -> Unit
//) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        CityDropdown(cityList, selectedCity, onCitySelected)
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(stringResource(R.string.choose_sport), style = MaterialTheme.typography.headlineMedium)
//        SportGrid(
//            selectedSport = selectedSport,
//            onSportSelected = onSportSelected,
//            modifier = Modifier.padding(top = 8.dp),
//        )
//
//        Spacer(modifier = Modifier.padding(16.dp))
//
//        Button(
//            onClick = onSearchClicked,
//            enabled = selectedSport != null,
//            modifier = Modifier.width(357.dp)
//        ) {
//            Text(stringResource(R.string.search_field))
//        }
//    }
//}
//
//@Composable
//fun CityDropdown(
//    cityList: List<City>,
//    selectedCity: City,
//    onCitySelected: (City) -> Unit
//) {
//    var expanded by remember { mutableStateOf(false) }
//    var selectedText by remember { mutableStateOf(selectedCity.name) }
//
//    Box(modifier = Modifier
//        .fillMaxWidth()
//        .padding(16.dp)) {
//
//        OutlinedTextField(
//            value = selectedText,
//            onValueChange = {},
//            readOnly = true,
//            label = { Text("Pilih Kota") },
//            trailingIcon = {
//                Icon(
//                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.ArrowDropDown,
//                    contentDescription = null
//                )
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { expanded = !expanded }
//        )
//
//        DropdownMenu(
//            expanded = expanded,
//            onDismissRequest = { expanded = false }
//        ) {
//            cityList.forEach { city ->
//                DropdownMenuItem(
//                    onClick = {
//                        selectedText = city.name
//                        onCitySelected(city)
//                        expanded = false
//                    },
//                    text = { Text(city.name) }
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun SportGrid(
//    modifier: Modifier,
//    selectedSport: String?,
//    onSportSelected: (String) -> Unit
//) {
//    val sports = DummyFieldData.sports
//
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp)
//            .height(330.dp)
//    ) {
//        items(sports) { sport ->
//            SportGridItem(
//                imageUrl = sport.imageUrl,
//                name = sport.name,
//                isSelected = selectedSport == sport.name,
//                onClick = { onSportSelected(sport.name) }
//            )
//        }
//    }
//}
//
//@Composable
//fun SportGridItem(
//    imageUrl: String,
//    name: String,
//    isSelected: Boolean,
//    onClick: () -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(330.dp)
//            .clip(RoundedCornerShape(16.dp))
//            .clickable { onClick() }
//    ) {
//        AsyncImage(
//            model = imageUrl,
//            contentDescription = name,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .fillMaxSize()
//        )
//
//        if (isSelected) {
//            Icon(
//                imageVector = Icons.Default.CheckCircle,
//                contentDescription = "Selected",
//                tint = Color.White,
//                modifier = Modifier
//                    .align(Alignment.TopEnd)
//                    .size(32.dp)
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Black.copy(alpha = 0.4f))
//        ) {
//            Text(
//                text = name,
//                color = Color.White,
//                modifier = Modifier
//                    .align(Alignment.BottomCenter)
//                    .padding(8.dp)
//            )
//        }
//    }
//}
//
//
//
//
//@Preview(showBackground = true)
//@Composable
//private fun SportGrid() {
//    SilaporTheme {
//        SportGrid(
//            selectedSport = stringResource(R.string.futsal),
//            onSportSelected = {},
//            modifier = Modifier
//        )
//    }
//}