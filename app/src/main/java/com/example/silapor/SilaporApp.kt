package com.example.silapor

import StatusTransaksiScreen
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.silapor.ui.navigation.NavigationItem
import com.example.silapor.ui.navigation.Screen
import com.example.silapor.ui.screen.home.HomeScreen
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.silapor.ui.screen.booking.BookingScreen
import com.example.silapor.ui.screen.fieldDetail.FieldDetailScreen

@Composable
fun SilaporApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = { SilaporTopAppBar(title = stringResource(R.string.app_name)) },
        bottomBar = {
            if (currentRoute != Screen.DetailField.route) {
                BottomBar(navController)
            }
        },
        modifier = Modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToBooking = { fieldId ->
                        navController.navigate(Screen.Booking.createRoute(fieldId))
                    }
                )
            }
            composable(
                route = Screen.Booking.route,
                arguments = listOf(navArgument("sportType") { type = NavType.StringType })
            ) { backStackEntry ->
                val sportType = backStackEntry.arguments?.getString("sportType") ?: ""
                BookingScreen(
                    sportType = sportType,
                    navigateToDetail = { fieldId ->
                        navController.navigate(Screen.BookingDetail.createRoute(fieldId))
                    }
                )
            }
            composable(Screen.StatusTransaksi.route) {
                StatusTransaksiScreen()
            }

            composable(
                route = Screen.BookingDetail.route,
                arguments = listOf(navArgument("fieldId") { type = NavType.IntType }),
            ) {
                val id = it.arguments?.getInt("fieldId") ?: -1
                FieldDetailScreen(
                    fieldId = id,
                    navigateBack = {
                        navController.navigateUp()
                    },
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SilaporTopAppBar(title: String) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
    )
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = Modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.menu_history),
                icon = Icons.Default.DateRange,
                screen = Screen.StatusTransaksi
            ),
        )
        navigationItems.map { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = { Text(item.title) },
                selected = currentRoute == item.screen.route,
                onClick = {
                    if (currentRoute != item.screen.route) {
                        navController.navigate(item.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}


