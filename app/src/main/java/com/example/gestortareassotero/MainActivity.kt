package com.example.gestortareassotero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gestortareassotero.auth.LoginScreen
import com.example.gestortareassotero.auth.SignUpScreen
import com.example.gestortareassotero.ui.theme.GestorTareasSoteroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestorTareasSoteroTheme {
                LoginScreen()
            }
        }
    }
}