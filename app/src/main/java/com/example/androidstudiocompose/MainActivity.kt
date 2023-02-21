package com.example.androidstudiocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androidstudiocompose.ui.theme.AndroidStudioComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudioComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Meu primeiro projeto compose", "Thiago Martins")
                }
            }
        }
    }
}

@Composable
fun Greeting(AppName: String, AppSubname: String) {
    Column {
        Text(text = "$AppName!", fontSize = 26.sp)
        Text(text = "$AppSubname!", fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidStudioComposeTheme {
        Greeting("Meu primeiro projeto compose", "Thiago Martins");
    }
}