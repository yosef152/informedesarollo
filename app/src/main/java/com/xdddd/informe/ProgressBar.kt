package com.xdddd.informe

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Preview
@Composable
fun IndeterminateProgressBar() {
    CircularProgressIndicator(
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun DeterminateProgressBar() {
    LinearProgressIndicator(
        progress = 0.5f, // Valor entre 0 y 1, por ejemplo, 50% de progreso
        modifier = Modifier.fillMaxWidth()
    )
}

//custom
@Preview
@Composable
fun CustomizedProgressBar() {
    // Proporcionando un valor predeterminado para `progress`
    val progress = 0.5f
    CircularProgressIndicator(
        progress = progress,
        color = Color.Green, // Cambia el color
        strokeWidth = 8.dp,  // Cambia el grosor de la barra
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun CustomizedLinearProgressBar() {
    // Proporcionando un valor predeterminado para `progress`
    val progress = 0.5f
    LinearProgressIndicator(
        progress = progress,
        color = Color.Blue,  // Cambia el color de la barra de progreso
        trackColor = Color.Gray, // Cambia el color de fondo (track)
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun ProgressBarWithCoroutine() {
    var progress by remember { mutableStateOf(0f) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            while (progress < 1f) {
                delay(100)  // Espera 100ms
                progress += 0.01f  // Aumenta el progreso
            }
        }
    }

    LinearProgressIndicator(
        progress = progress,
        modifier = Modifier.fillMaxWidth() // Asegura que ocupe todo el ancho disponible
    )
}
