package com.example.gestortareassotero.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally ) {
            Title(
                message = "Bienvenido a el Gestor De Tareas"
            )
            Login(
                message = "Iniciar Sesión"
            )
            TextField(
                message = "Email"
            )
            TextField(
                message = "Contraseña"
            )
            MyButton(
                message = "Enviar",
                onClick = {
                    //Poner lógica más adelante
                }
            )
        }
    }
}

@Composable
fun SignUpScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally ) {
            Title(
                message = "Bienvenido a el Gestor De Tareas"
            )
            Login(
                message = "Registrarte"
            )
            TextField(
                message = "Email"
            )
            TextField(
                message = "Contraseña"
            )
            MyButton(
                message = "Enviar",
                onClick = {
                    //Poner lógica más adelante
                }
            )
        }
    }
}

@Composable
fun Title(message: String) {
    Text(
        text = message,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )
}

@Composable
fun Login(message: String) {
    Text(
        text = message,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )
}

@Composable
fun TextField(message: String) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = {Text(message)}
    )
}

@Composable
fun MyButton(message: String, onClick: () -> Unit) {

    Button(onClick = { onClick() }) {
        Text(message)
    }
}