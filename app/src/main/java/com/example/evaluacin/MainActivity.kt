package com.example.evaluacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.example.evaluacin.model.Gadget
import com.example.evaluacin.ui.screens.GadgetHomeScreen
import com.example.evaluacin.ui.screens.GadgetCatalogScreen
import com.example.evaluacin.ui.screens.GadgetDetailScreen
import com.example.evaluacin.ui.theme.EvaluaciónTheme

enum class AppScreen {
    Home,
    Catalog,
    Detail
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EvaluaciónTheme {
                MainAppNavigation()
            }
        }
    }
}

/**
 * Componente superior que coordina el flujo de pantallas y la selección de ítems del catálogo de la entidad Gadget.
 * Aplica rigurosamente la técnica de Elevación de Estado (State Hoisting) usando remember y mutableStateOf.
 */
@Composable
fun MainAppNavigation() {
    var currentScreen by remember { mutableStateOf(AppScreen.Home) }
    var selectedGadget by remember { mutableStateOf<Gadget?>(null) }

    when (currentScreen) {
        AppScreen.Home -> {
            GadgetHomeScreen(
                onNavigateToCatalog = {
                    currentScreen = AppScreen.Catalog
                }
            )
        }
        AppScreen.Catalog -> {
            GadgetCatalogScreen(
                onGadgetSelected = { gadget ->
                    // State Hoisting: se eleva el gadget seleccionado al contenedor superior
                    selectedGadget = gadget
                    currentScreen = AppScreen.Detail
                },
                onNavigateBack = {
                    currentScreen = AppScreen.Home
                }
            )
        }
        AppScreen.Detail -> {
            if (selectedGadget != null) {
                GadgetDetailScreen(
                    gadget = selectedGadget!!,
                    onNavigateBack = {
                        currentScreen = AppScreen.Catalog
                    }
                )
            } else {
                currentScreen = AppScreen.Catalog
            }
        }
    }
}
