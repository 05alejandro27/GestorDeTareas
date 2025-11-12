package com.example.gestortareassotero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gestortareassotero.navigation.AppNavigation
import com.example.gestortareassotero.ui.theme.GestorTareasSoteroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestorTareasSoteroTheme {
                AppNavigation()
            }
        }
    }
}