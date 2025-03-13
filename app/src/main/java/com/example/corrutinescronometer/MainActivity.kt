package com.example.corrutinescronometer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.corrutinescronometer.ui.CounterScreen
import com.example.corrutinescronometer.ui.theme.CorrutinesCronometerTheme
import com.example.coroutinesapp.viewmodel.MainViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel:MainViewModel by viewModels()

        enableEdgeToEdge()
        setContent {

            CorrutinesCronometerTheme {
                CounterScreen(viewModel)
            }
        }
    }
}
