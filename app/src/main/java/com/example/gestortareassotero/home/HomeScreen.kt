package com.example.gestortareassotero.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen () {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally ) {
            TitleHome(
                message = "Has entrado en el Gestor De Tareas"
            )
            MyButton(
                message = "Deslogar",
                onClick = {
                    //Poner lógica más adelante
                }
            )
        }
    }
}

@Composable
fun TitleHome(message: String) {
    Text(
        text = message,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )
}

@Composable
fun MyButton(message: String, onClick: () -> Unit) {

    Button(onClick = { onClick() }) {
        Text(message)
    }
}