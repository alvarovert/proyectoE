package com.example.proyectoestrella

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectoestrella.ui.theme.ProyectoEstrellaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoEstrellaTheme {
                // A surface container using the 'background' color from the theme
                Myapp()
                //Inicio()
                //Perfil()
            }
        }
    }
}

@Composable
fun Myapp(modifier: Modifier = Modifier){
    var MostrarInicio by remember { mutableStateOf(true) }
    Surface(modifier) {
        if (MostrarInicio){
            Inicio(onContinueClicked = {MostrarInicio= false})
        } else{
            Perfil()
        }
    }



}

@Composable
fun Encuestas(){}

@Composable
fun Inicio(modifier: Modifier = Modifier,onContinueClicked: ()->Unit){
    var MostrarInicio by remember { mutableStateOf(true) }

    Surface(color = MaterialTheme.colors.background){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
        ) {
            Column() {
                Button(onClick = onContinueClicked) {
                    Text(text = "perfil",style = MaterialTheme.typography.h4 )
                }
            }
        }
    }
    
}
@Composable
fun Perfil(modifier: Modifier = Modifier){
    Surface(color= MaterialTheme.colors.surface){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(45.dp)
        ) {
            Text(text = "Aqui va información", style = MaterialTheme.typography.h4)

        }

    }
}
