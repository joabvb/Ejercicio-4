package com.example.corrutinescronometer.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coroutinesapp.viewmodel.MainViewModel
import androidx.compose.foundation.layout.*

@Composable
fun CounterScreen(viewModel: MainViewModel) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Contador 1: ${viewModel.countTime1}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Contador 2: ${viewModel.countTime2}")
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { viewModel.startCounters() }, enabled = !viewModel.isRunning) {
            Text(text = "Iniciar Contadores")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { viewModel.cancelCounters() }, enabled = viewModel.isRunning) {
            Text(text = "Cancelar")
        }
    }
}