package com.de573f4n.setupandroidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.de573f4n.setupandroidstudio.ui.theme.SetupAndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetupAndroidStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Greeting("Schilke")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.LightGray) {
        Text(text = "Hi, my name is $name!", modifier = Modifier.padding(24.dp))
    } }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SetupAndroidStudioTheme {
        Greeting("Schilke")
    }
}
