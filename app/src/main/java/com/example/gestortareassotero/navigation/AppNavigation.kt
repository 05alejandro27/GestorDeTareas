package com.example.gestortareassotero.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gestortareassotero.auth.LoginScreen
import com.example.gestortareassotero.auth.SignUpScreen
import com.example.gestortareassotero.home.HomeScreen
import com.google.firebase.auth.FirebaseAuth

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    // Crea el controlador de navegación y lo guarda en memoria.
    // Es el objeto que usaremos para movernos entre pantallas.

    // Comprueba si hay un usuario actualmente logueado.
    val firebaseUser = FirebaseAuth.getInstance().currentUser
    // Obtiene la instancia de Firebase Auth y pregunta si hay un usuario
    // con sesión activa. Si hay alguien logueado devuelve sus datos,
    // si no devuelve null.

    // Define el destino inicial en función del estado de autenticación.
    val startDestination = if (firebaseUser != null) {
        // Decidimos cuál será la primera pantalla que verá el usuario.
        // Si firebaseUser NO es null (hay alguien logueado)...

        "home"
        // ...mostramos directamente la pantalla principal.
    } else {
        "login"
        // Si no hay nadie logueado, mostramos la pantalla de login.
    }

    NavHost(navController = navController, startDestination = startDestination) {
        // NavHost es el contenedor que define todas las rutas posibles.
        // Le pasamos el controlador y la pantalla inicial que calculamos antes.

        composable("login") {
            // Definimos una ruta llamada "login". Cuando naveguemos a "login"...

            LoginScreen(navController = navController)
            // ...se mostrará esta pantalla. Le pasamos el navController para que
            // desde LoginScreen podamos navegar a otras pantallas.
        }

        composable("register") {
            // Definimos la ruta "register" para la pantalla de registro.

            SignUpScreen(navController = navController)
            // Muestra la pantalla de registro, también con acceso al navController.
        }

        composable("home") {
            // Definimos la ruta "home" para la pantalla principal.

            HomeScreen()
            // Muestra la pantalla principal. Esta no necesita el navController
            // porque probablemente sea la pantalla final o tenga otra lógica.
        }
    }
}