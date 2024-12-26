package com.xdddd.informe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.shape.RoundedCornerShape


// Componente de tarjeta básica
@Preview
@Composable
fun BasicCard() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Título de la tarjeta")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Contenido de la tarjeta. Aquí va la descripción o información adicional.")
        }
    }
}

// Componente de tarjeta personalizada con borde redondeado y sombra
@Preview
@Composable
fun CustomizedCard() {
    Card(
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp), // Establece la elevación de la tarjeta
        shape = RoundedCornerShape(16.dp), // Bordes redondeados
        colors = CardDefaults.cardColors(containerColor = Color.LightGray) // Color de fondo
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Tarjeta personalizada con borde redondeado y sombra."
            )
        }
    }
}

// Componente de tarjeta con imagen
@Preview
@Composable
fun CardWithImage() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            val image: Painter = painterResource(id = R.drawable.tomoe)
            Image(painter = image, contentDescription = "Imagen dentro de la tarjeta")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Título de la tarjeta con imagen")
            Text(text = "Descripción de la tarjeta. Aquí se puede incluir más información.")
        }
    }
}

// Componente de tarjeta interactiva (clickable)
@Preview
@Composable
fun ClickableCard() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .clickable { /* Acción al hacer clic */ }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Card interactiva")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Haz clic en esta tarjeta para realizar una acción.")
        }
    }
}

// Componente de lista de tarjetas (LazyColumn)
@Preview
@Composable
fun CardList() {
    LazyColumn {
        items(10) { index ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Elemento $index")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Descripción del elemento $index.")
                }
            }
        }
    }
}
