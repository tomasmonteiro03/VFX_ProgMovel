package com.tmo.testweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import com.tmo.testweatherapp.ui.theme.TestWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestWeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, color: Color = Color.Black,modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier, color = color
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestWeatherAppTheme {
        Greeting("Android",color = Color.Green)
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFF0000)
@Composable
fun GreetingPreviewXL() {
    TestWeatherAppTheme {
        Greeting("Android", color = Color.White)
    }
}